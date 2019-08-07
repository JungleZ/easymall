package cn.tedu.utils;


/**
 * 用于帮文件夹起名字
 */
public class UploadUtil {
	
	public static String getUploadPath(String fileName,String upload){
		
		//根据文件名称,生成hash字符串,截取前8位
		//1k2k2k3l5l6k3h4n4h4hn4nu4--1/k/2k/2k/3/l/5/l
		String hash = Integer.toHexString(fileName.hashCode());
		while(hash.length()<8){
			hash += "0";
		}
		for (int i = 0; i < hash.length(); i++) {
			upload += "/"+hash.charAt(i);
		}
		
		
		return upload;
	}
}
