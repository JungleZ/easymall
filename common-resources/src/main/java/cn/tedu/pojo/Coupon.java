package cn.tedu.pojo;

import java.util.Date;

/**
 * 优惠券
 */
public class Coupon {
    private Long id;

    /**
     * 是否可用
     */
    private Integer available;

    /**
     * 不可用原因
     */
    private String reason;

    /**
     * 优惠券价值，比如抵用2元，则需要传值为200
     */
    private Integer value;

    /**
     * 折扣券优惠金额文案
     */
    private String valueDesc;

    private String name;

    /**
     * 单位文案
     */
    private String unitDesc;

    /**
     * 描述
     */
    private String description;

    private Date startTime;

    private Date endTime;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 满减条件
     */
    private String condition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getValueDesc() {
        return valueDesc;
    }

    public void setValueDesc(String valueDesc) {
        this.valueDesc = valueDesc == null ? null : valueDesc.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUnitDesc() {
        return unitDesc;
    }

    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc == null ? null : unitDesc.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public String getCondition() {
        return condition;
    }

    public void String(String condition) {
        this.condition = condition;
    }
}