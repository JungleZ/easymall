package cn.tedu.pojo;

import java.util.Date;

/**
 * 商品分类
 */
public class GoodsCat {
    private Integer id;

    /**
     * 上级分类
     */
    private Integer parentId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类状态：0.不可用，1.可用
     */
    private Integer status;

    /**
     * 是否是第一级分类
     */
    private Integer isParent;

    /**
     * 同级分类间依据什么排序
     */
    private Integer sortOrder;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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