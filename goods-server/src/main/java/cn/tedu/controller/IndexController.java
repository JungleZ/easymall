package cn.tedu.controller;

import cn.tedu.service.IndexService;
import cn.tedu.vo.SwiperListVo;
import cn.tedu.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sale")
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/frontRecommand")
    public SysResult tuijian(){

        try{
            SwiperListVo swiperListVo = indexService.tuijian();
            return new SysResult(200,"",swiperListVo);
        }catch (Exception e){
            e.printStackTrace();
            return SysResult.build(201,"",null);
        }


    }

}
