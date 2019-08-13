package cn.tedu.controller;

import cn.tedu.pojo.Product;
import cn.tedu.service.ProductService;
import cn.tedu.vo.EasyUIResult;
import cn.tedu.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    //新增商品数据
    //前端传递请求体参数
    //productName=wan&productPrice=5000&productCategory=shouji
    //springmvc处理参数时根据你自己接受格式转化
    @RequestMapping("/insert")
    public SysResult saveProduct(Product product){
        //利用一个异常逻辑判断新增成功失败
        try{
            productService.saveProduct(product);
            return SysResult.ok();//{"status":200,"msg":"ok"}
        }catch(Exception e){
            e.printStackTrace();
            return SysResult.build(201,
                    e.getMessage(), null);
        }
    }

    @RequestMapping("/selectList/{currentPage}/{pageSize}")
    public EasyUIResult queryPages(@PathVariable Integer currentPage,
                                   @PathVariable Integer pageSize){
        try{
            //控制层不关心业务层封装数据逻辑
            EasyUIResult result=
                    productService.pageQuery(currentPage,pageSize);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
