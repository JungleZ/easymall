package cn.tedu.service;

import cn.tedu.pojo.Goods;
import cn.tedu.vo.SearchResult;

public interface GoodsService {


    SearchResult queryProduct(String keyword, String shaixuan, String currentPage, String pageSize);

    void createIndex();

    String queryCategoryById(Integer categoryId);

    void saveGoods(Goods goods);
}
