package cn.tedu.utils;

import java.util.UUID;

/**
 * 用于给文件起名
 */
public class UUIDUtil {
	public static String getUUID(){
		UUID uuid=UUID.randomUUID();
		return uuid.toString();
	}
	public static void main(String[] args) {
		System.out.println(getUUID());
	}
}
