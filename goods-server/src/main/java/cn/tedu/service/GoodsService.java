package cn.tedu.service;

import cn.tedu.pojo.Product;
import cn.tedu.pojo.User;

import java.util.List;

public interface GoodsService {


    List<Product> queryProduct(String keyword, String shaixuan, String currentPage, String pageSize);

    void createIndex(String emindex);
}
