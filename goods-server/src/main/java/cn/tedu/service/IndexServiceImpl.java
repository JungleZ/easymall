package cn.tedu.service;

import cn.tedu.mapper.IndexMapper;
import cn.tedu.vo.SwiperListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexMapper indexMapper;


    @Override
    public SwiperListVo tuijian() {
        SwiperListVo swiperListVo = new SwiperListVo();
        swiperListVo.setHotList(indexMapper.hotList());
        swiperListVo.setGroupbuyList(indexMapper.groupbuyList());
        swiperListVo.setSeckillList(indexMapper.seckillList());
        swiperListVo.setClothesList(indexMapper.clothesList());
        swiperListVo.setPantsList(indexMapper.pantsList());
        swiperListVo.setShoesList(indexMapper.shoesList());

        return swiperListVo;
    }
}
