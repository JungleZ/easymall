package cn.tedu.vo;

import cn.tedu.pojo.Product;
import cn.tedu.pojo.SeckillGoods;

import java.util.List;

public class SwiperListVo {

    private List<Product> hotList;
    private List<SeckillGoods> seckillList;
    private List<Product> groupbuyList;
    private List<Product> clothesList;
    private List<Product> pantsList;
    private List<Product> shoesList;

    public List<Product> getHotList() {
        return hotList;
    }

    public void setHotList(List<Product> hotList) {
        this.hotList = hotList;
    }

    public List<SeckillGoods> getSeckillList() {
        return seckillList;
    }

    public void setSeckillList(List<SeckillGoods> seckillList) {
        this.seckillList = seckillList;
    }

    public List<Product> getGroupbuyList() {
        return groupbuyList;
    }

    public void setGroupbuyList(List<Product> groupbuyList) {
        this.groupbuyList = groupbuyList;
    }

    public List<Product> getClothesList() {
        return clothesList;
    }

    public void setClothesList(List<Product> clothesList) {
        this.clothesList = clothesList;
    }

    public List<Product> getPantsList() {
        return pantsList;
    }

    public void setPantsList(List<Product> pabtsList) {
        this.pantsList = pabtsList;
    }

    public List<Product> getShoesList() {
        return shoesList;
    }

    public void setShoesList(List<Product> shoesList) {
        this.shoesList = shoesList;
    }
}
