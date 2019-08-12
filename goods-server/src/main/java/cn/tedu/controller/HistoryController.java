package cn.tedu.controller;

import cn.tedu.service.HistoryService;
import cn.tedu.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    //添加历史查询记录
    @RequestMapping("history/insert/{userId}")
    public SysResult saveHistory(String history, @PathVariable Long userId){
        try{
            historyService.saveHistory(history, userId);
            return  SysResult.ok();
        }catch(Exception e){
            e.printStackTrace();
            return  SysResult.build(201,"",null);
        }
    }

    //查询历史查询记录
    @RequestMapping("history/select/{userId{")
    public List<String> queryMyHistory(@PathVariable Long userId){
        //通过判断userId是否为空,判断是否绕过了js校验
        if(!StringUtils.isEmpty(userId)){
            return historyService.queryMyHistory(userId);
        }else{
            return null;
        }
    }
    //删除历史查询记录
    @RequestMapping("/history/delete/{userId}")
    public SysResult deleteHistory(@PathVariable Long userId){
        try{
            historyService.deleteHistory(userId);
            return SysResult.ok();
        }catch(Exception e){
            e.printStackTrace();
            return  SysResult.build(201,"",null);
        }
    }
}
