package cn.tedu.vo;

import cn.tedu.pojo.Product;

import java.util.List;


public class SearchResult {
    /**
     * 商品的集合
     */
    private List<Product> list;
    /**
     * 查询的总条数
     */
    private Integer total;

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

