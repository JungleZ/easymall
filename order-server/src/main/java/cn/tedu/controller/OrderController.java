package cn.tedu.controller;

import cn.tedu.pojo.OrderDto;
import cn.tedu.service.OrderService;
import cn.tedu.vo.OrderSubmitVo;
import cn.tedu.vo.SysResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    //提交的新增订单
    @RequestMapping(value = "submit/{userId}", method = {RequestMethod.POST})
    public SysResult insertSelective(@PathVariable("userId") Long userId, String buyList, int sum) {
        ObjectMapper op = new ObjectMapper();
        //op.convertValue(buyList, OrderGoodsDto.class);

        System.out.println(buyList);
        System.out.println(sum);
        try {
//            OrderSubmitVo orderSubmitVo = orderService.insertSelective(order);
            OrderSubmitVo orderSubmitVo = orderService.insertSelective(userId, buyList, sum);
            return SysResult.build(200, "ok", orderSubmitVo);
        } catch (Exception e) {
            e.printStackTrace();
            return SysResult.build(201, "失败", null);
        }

//        try {
//           OrderSubmitVo orderSubmitVo=orderService.insert(order);
//            return SysResult.build(200, "", null);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return SysResult.build(201, "", null);
//        }
    }

    /*@RequestMapping("submit")
    public SysResult insertSelective(Stirng id) {
        try {
            orderService.insertSelective(id);
            return SysResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return SysResult.build(201, "", null);
        }
    }*/

    /*@RequestMapping("submit")
    public SysResult submitOrders(@RequestParam("orderId") String Id) {
        try {
            orderService.submitOrders(Id);
            return SysResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return SysResult.build(201, "", null);
        }

    }*/

    //删除订单
    @RequestMapping("delete/{orderId}")
    public SysResult deleteOrder(@PathVariable("orderId") String id) {
        try {
            orderService.deleteOrder(id);
            return SysResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return SysResult.build(201, "", null);
        }

    }

    //查询订单详情
    @RequestMapping("detail/{orderId}")
    public List<OrderDto> queryOrder(@PathVariable("orderId") String id) {
        return orderService.queryOrder(id);
    }

    //查询我的所有订单列表
    @RequestMapping("list/{userId}")
    public List<OrderDto> queryMyOrders(@PathVariable String userId) {
        return orderService.queryMyOrders(userId);
    }

//    @RequestMapping("status/{orderId}")
//    public List<Order> updateStatusOrder(@PathVariable("orderId") String id) {
//        return orderService.updateStatusOrder(id);
//    }






}
