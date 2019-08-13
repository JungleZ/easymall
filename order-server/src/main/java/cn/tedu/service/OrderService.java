package cn.tedu.service;

import cn.tedu.pojo.OrderDto;
import cn.tedu.vo.OrderSubmitVo;

import java.io.IOException;
import java.util.List;

public interface OrderService {

//    OrderSubmitVo insert(OrderDto order);

//    OrderSubmitVo insert(OrderDto order);

    OrderSubmitVo insertSelective(Long userId, String buyList, int sum) throws IOException;

//    void submitOrders(String userId);

    void deleteOrder(String id);

    List<OrderDto> queryOrder(String id);

    List<OrderDto> queryMyOrders(String userId);


}
