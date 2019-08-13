package cn.tedu.controller;

import cn.tedu.pojo.Product;
import cn.tedu.service.GoodsServiceImpl;
import cn.tedu.vo.SearchResult;
import cn.tedu.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {
    @Autowired
    private GoodsServiceImpl goodsService;
    @RequestMapping("/goods/selectList/{keyword}/{shaixuan}/{currentPage}/{pageSize}")
    public SysResult SearchProducts(@PathVariable String keyword, @PathVariable String shaixuan, @PathVariable String currentPage, @PathVariable String pageSize ){
        try {
            SearchResult result = goodsService.queryProduct(keyword,shaixuan,currentPage,pageSize);
            return SysResult.build(200,"搜索成功",result);
        }catch (Exception e){
            e.printStackTrace();
            return SysResult.build(201,"搜索失败",null);
        }
    }
    @RequestMapping("save")
    public String createIndex(){
        goodsService.createIndex();
        return "success";
    }
}
