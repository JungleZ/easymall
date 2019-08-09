package cn.tedu.pojo;

import java.util.Date;

/**
 * 商品详情
 */
public class Goods {
    /**
     * id
     */
    private Long id;

    /**
     * 商品的分类
     */
    private Integer goodsCatId;

    /**
     * 关联商品的基本描述
     */
    private Integer productId;

    /**
     * 颜色
     */
    private String color;

    /**
     * 尺码
     */
    private String size;

    /**
     * 库存
     */
    private Long stock;

    /**
     * 市场价
     */
    private Long marketPrice;

    /**
     *  活动价
     */
    private Long activityPrice;

    /**
     * 销售总数
     */
    private Long saleNum;

    /**
     * 商品的状态：0.下架，1.正常，2.秒杀，3.团购，4.活动促销
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGoodsCatId() {
        return goodsCatId;
    }

    public void setGoodsCatId(Integer goodsCatId) {
        this.goodsCatId = goodsCatId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getActiviryPrice() {
        return activityPrice;
    }

    public void setActiviryPrice(Long activityPrice) {
        this.activityPrice = activityPrice;
    }

    public Long getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Long saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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