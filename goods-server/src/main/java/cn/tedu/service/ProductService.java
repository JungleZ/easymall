package cn.tedu.service;

import cn.tedu.pojo.Product;
import cn.tedu.vo.EasyUIResult;

public interface ProductService {
    void saveProduct(Product product);

    EasyUIResult pageQuery(Integer currentPage, Integer pageSize);
}
