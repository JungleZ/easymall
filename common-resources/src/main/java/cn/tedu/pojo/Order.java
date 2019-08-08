package cn.tedu.pojo;

import java.util.Date;

/**
 * 订单商品
 */
public class Order {
    private String id;

    private Long userId;

    private String receiver;

    private String tel;

    private String addressFrom;

    private String addressTo;

    private String message;

    private Integer sum;

    private Integer postMoney;

    private Integer realPay;

    private Byte payType;

    private Byte status;

    private Date created;

    private Date updated;

    private Date payTime;

    private Date consignTime;

    private Date receiptTime;

    private Date closed;

    private Date finished;

    private Byte isInvoice;

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

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
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

    public Byte getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId == null ? null : invoiceId.trim();
    }
}