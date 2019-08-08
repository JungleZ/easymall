package cn.tedu.service;

import cn.tedu.mapper.MenberMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ManberServiceImpl implements ManberService {
    @Autowired
    private MenberMapper menberMapper;



}
