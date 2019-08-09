package cn.tedu.pojo;

import java.util.Date;

/**
 * 订单商品
 */
public class Order {
    /**
     * 订单id
     */
    private String id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 收货人名字
     */
    private String receiver;

    /**
     * 收货人电话
     */
    private String tel;

    /**
     * 从哪里发货
     */
    private String addressFrom;

    /**
     * 送货目的地
     */
    private String addressTo;

    /**
     * 收货人的备注
     */
    private String message;

    /**
     * 订单商品的总价
     */
    private Integer sum;

    /**
     * 运费，*100
     */
    private Integer postMoney;

    /**
     * 实付多少钱，*100
     */
    private Integer realPay;

    /**
     * 支付类型：1.支付宝，2.微信，3.到付
     */
    private Integer payType;

    /**
     * 0.创建订单，待支付
     * 1.支付订单，待发货
     * 2.已发货，待接收
     * 3.已接收，待确认
     * 4.已确认，待评价
     * 5.已评价，订单完成
     * 6.未支付，订单关闭
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

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date consignTime;

    /**
     * 收货时间
     */
    private Date receiptTime;

    /**
     * 订单关闭时间
     */
    private Date closed;

    /**
     * 订单完成时间
     */
    private Date finished;

    /**
     * 是否需要发票
     */
    private Integer isInvoice;

    /**
     * 发票id
     */
    private String invoiceId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom == null ? null : addressFrom.trim();
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo == null ? null : addressTo.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getPostMoney() {
        return postMoney;
    }

    public void setPostMoney(Integer postMoney) {
        this.postMoney = postMoney;
    }

    public Integer getRealPay() {
        return realPay;
    }

    public void setRealPay(Integer realPay) {
        this.realPay = realPay;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public Date getFinished() {
        return finished;
    }

    public void setFinished(Date finished) {
        this.finished = finished;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId == null ? null : invoiceId.trim();
    }
}