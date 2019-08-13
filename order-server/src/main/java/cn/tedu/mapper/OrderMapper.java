package cn.tedu.mapper;

import cn.tedu.pojo.OrderDto;

import java.util.List;

public interface OrderMapper {

//    void insert(OrderDto order);

    void insertSelective(OrderDto order);

    void insertOrderGoods(OrderDto order);

//    void submitOrders(String userId);

    void deleteOrder(String id);

    List<OrderDto> queryOrder(String id);

    List<OrderDto> queryMyOrders(String userId);
}
