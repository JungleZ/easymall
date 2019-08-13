package cn.tedu.service;

import cn.tedu.mapper.ProductMapper;
import cn.tedu.pojo.Product;
import cn.tedu.vo.EasyUIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    /*
    *添加商品 方法
    * 前端参数参数没有id（数据库自增，不管）
    * createTime和updateTime （生成补全）
    *
    * */

    @Override
    public void saveProduct(Product product) {

        try{
            //为新增商品补齐创建时间和更新时间， id由数据库主键自增生成
            product.setCreated(new Date(System.currentTimeMillis()));
            product.setUpdated(new Date(System.currentTimeMillis()));
            productMapper.insert(product);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public EasyUIResult pageQuery(Integer currentPage, Integer pageSize) {
      try{
          int start=(currentPage-1)*pageSize;
          //封装EasyUIResult total select count(*)
          //List<Product>
          EasyUIResult result=new EasyUIResult();
          List<Product> pList=productMapper.pageQuery(start,pageSize);
          Integer total=productMapper.queryCount();
          //封装数据
          result.setRows(pList);
          result.setTotal(total);
          return result;
      }catch (Exception e){
          e.printStackTrace();
          return null;
      }
    }
}
