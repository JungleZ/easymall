package cn.tedu.service;

import cn.tedu.mapper.ReceiverMapper;
import cn.tedu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiverServiceImpl implements ReceiverService {
    @Autowired
    private ReceiverMapper receiverMapper;



}
