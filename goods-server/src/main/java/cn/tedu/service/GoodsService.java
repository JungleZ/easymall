package cn.tedu.service;

import cn.tedu.pojo.Product;
import cn.tedu.pojo.User;
import cn.tedu.vo.SearchResult;

import java.util.List;

public interface GoodsService {


    SearchResult queryProduct(String keyword, String shaixuan, String currentPage, String pageSize);

    void createIndex();
}
