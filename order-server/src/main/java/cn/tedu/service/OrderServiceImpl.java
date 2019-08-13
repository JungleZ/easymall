package cn.tedu.service;

import cn.tedu.mapper.OrderGoodsMapper;
import cn.tedu.mapper.OrderMapper;
import cn.tedu.pojo.OrderDto;
import cn.tedu.pojo.OrderGoodsDto;
import cn.tedu.vo.OrderSubmitVo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;

    private OrderDto order = new OrderDto();

    private OrderGoodsDto orderGoods = new OrderGoodsDto();


    @Override
    public OrderSubmitVo insertSelective(Long userId, String buyList, int sum) throws IOException {
        Date date = new Date();
        order.setId(UUID.randomUUID().toString());
        order.setUserId(userId);
        //0未支付
        order.setStatus(0);
        order.setCreated(date);
        order.setSum(sum);

        ObjectMapper mapper = new ObjectMapper();
        List<OrderGoodsDto> list = mapper.readValue(buyList, new TypeReference<List<OrderGoodsDto>>(){});
        order.setBuyList(list);
        System.out.println(order.toString());

        orderMapper.insertSelective(order);
        orderMapper.insertOrderGoods(order);

        //返回信息
        OrderSubmitVo orderSubmitVo = new OrderSubmitVo();
        orderSubmitVo.setOrderId(order.getId());
        Long timeStamp = date.getTime();
        orderSubmitVo.setCreated(timeStamp);
        return orderSubmitVo;
    }

    /*@Override
    public OrderSubmitVo insert(OrderDto order) {
        Date date = new Date();
        order.setId(UUID.randomUUID().toString());
        //0未支付
        order.setStatus(0);
        order.setCreated(date);
        orderMapper.insert(order);

        //返回信息
        OrderSubmitVo orderSubmitVo = new OrderSubmitVo();
        orderSubmitVo.setOrderId(order.getId());
        Long timeStamp = date.getTime();
        orderSubmitVo.setCreated(timeStamp);
        return orderSubmitVo;
    }*/

    /*@Override
    public int insertSelective(User record) {
        return 0;
    }*/

    /*@Override
    public void submitOrders(String userId) {
        orderMapper.submitOrders(userId);
    }*/



    @Override
    public void deleteOrder(String id) {
        orderMapper.deleteOrder(id);
    }

    @Override
    public List<OrderDto> queryOrder(String id) {
        return orderMapper.queryOrder(id);
    }

    @Override
    public List<OrderDto> queryMyOrders(String userId) {
        return orderMapper.queryMyOrders(userId);
    }

}
