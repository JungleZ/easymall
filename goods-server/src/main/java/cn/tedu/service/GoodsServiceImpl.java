package cn.tedu.service;

import cn.tedu.mapper.GoodsCatMapper;
import cn.tedu.mapper.GoodsMapper;
import cn.tedu.mapper.ProductMapper;
import cn.tedu.pojo.Product;
import cn.tedu.pojo.User;
import cn.tedu.utils.MapperUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsCatMapper goodsCatMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private TransportClient client;

    @Override
    public List<Product> queryProduct(String keyword, String shaixuan, String currentPage, String pageSize) {
        //构造一个查询条件
        MultiMatchQueryBuilder query = QueryBuilders.multiMatchQuery(keyword, "name", "title", "detail");
        //按照分页查询
        int page = Integer.parseInt(currentPage);
        int size = Integer.parseInt(pageSize);
        int start = (page - 1) * size;
        SearchResponse response = client.prepareSearch("small").setQuery(query).setFrom(start).setSize(size).get();
        SearchHits hits = response.getHits();
        List<Product> products = new ArrayList<>();
        //准备一个封装数据的list
        for (SearchHit hit : hits) {
            //获取hit中的资源json字符串,并封装到product中
            String source = hit.getSourceAsString();
            try {
                Product product = MapperUtil.MP.readValue(source, Product.class);
                products.add(product);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return products;
    }

    @Override
    public void createIndex(String emindex) {
        //从数据库拉取数据(product数据)
        List<Product> list = productMapper.queryAll();
        //把数据输出到索引文件中,索引文件及mapping已经创建完成(samll),只需要添加数据到索引文件
        //遍历list集合,存贮索引
        for (Product product : list) {
            try {
                String s = MapperUtil.MP.writeValueAsString(product);
                IndexRequestBuilder request = client.prepareIndex("small", "product", "product.getId()").setSource(s);
                IndexResponse indexResponse = request.get();
                //检查一下是否成功
                System.out.println(indexResponse.getResult());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }
}
