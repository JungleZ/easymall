package cn.tedu.utils;

import java.util.Random;

/**
 * 用于产生随机数的工具
 */
public class RandomUtils {
    public static String Ramdom(){
        Random rand = new Random();
        String code="";
        for(int i=0; i<6; i++) {
            int a =rand.nextInt(10);
            code+=a;
            System.out.println(a);
        }
        return code;
    }

}
