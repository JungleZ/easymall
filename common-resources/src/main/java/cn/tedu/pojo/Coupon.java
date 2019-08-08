package cn.tedu.pojo;

import java.util.Date;

/**
 * 优惠券
 */
public class Coupon {
    private Long id;

    private Byte available;

    private Byte reason;

    private Integer value;

    private String valueDesc;

    private String name;

    private String unitDesc;

    private String description;

    private Date startTime;

    private Date endTime;

    private Date created;

    private Date updated;

    private Date condition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    public Byte getReason() {
        return reason;
    }

    public void setReason(Byte reason) {
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

    public Date getCondition() {
        return condition;
    }

    public void setCondition(Date condition) {
        this.condition = condition;
    }
}