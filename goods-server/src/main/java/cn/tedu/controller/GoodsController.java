package cn.tedu.controller;

import cn.tedu.pojo.Goods;
import cn.tedu.pojo.Product;
import cn.tedu.pojo.User;
import cn.tedu.service.GoodsService;
import cn.tedu.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


    /**
     * 二级查询商品分类   （？？？,需求不明确，查询名称的话没有对应对象，此处写死为 "普通商品"）
     * 请求路径和参数 /goods/categorySelect/categroyId
     * 返回值（参数内容和类型）： 类型为String，参数值不确定
     * @param categoryId
     * @return
     */

    @RequestMapping("/categorySelect/{categroyId}")
    public String queryCategoryById(@PathVariable Integer categoryId){
        try{
            return goodsService.queryCategoryById(categoryId);
        }catch (Exception e){
            return "";
        }
    }


    /**
     * 添加商品
     * post方式提交参数
     * @param  product
     * @return
     */

    @RequestMapping("/insert")
    public SysResult saveProduct(Goods goods) {
        try{
            goodsService.saveGoods(goods);
            return SysResult.ok();//{"status":200,"msg":"ok"}
        }catch(Exception e){
            e.printStackTrace();
            return SysResult.build(201,
                    e.getMessage(), null);
        }
    }
}
