package cn.tedu.pojo;

import java.util.Date;

/**
 * 订单商品，一个订单对应多个订单商品
 */
public class OrderGoods {
    /**
     * 关联的订单
     */
    private String orderId;

    /**
     * 关联的商品id
     */
    private Long goodsId;

    /**
     * 买多少个此商品
     */
    private Integer num;

    /**
     * 此商品的总价 = num * unitPrice
     */
    private Long total;

    /**
     * 此商品单价，*100
     */
    private Long unitPrice;

    /**
     * 图片，取第一张图片
     */
    private String img;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}