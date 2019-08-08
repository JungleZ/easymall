package cn.tedu.pojo;

import java.util.Date;

/**
 * 商品详情
 */
public class Goods {
    private Long id;

    private Integer goodsCatId;

    private Integer productId;

    private String color;

    private String size;

    private Long stock;

    private Long marketPrice;

    private Long activiryPrice;

    private Long saleNum;

    private Byte status;

    private Date created;

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
        return activiryPrice;
    }

    public void setActiviryPrice(Long activiryPrice) {
        this.activiryPrice = activiryPrice;
    }

    public Long getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Long saleNum) {
        this.saleNum = saleNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
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