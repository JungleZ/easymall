package cn.tedu.vo;

/**
 * author hongziheng
 * 图片封装类
 */
public class PicUploadResult {
    private Integer error=0;		//图片上传错误不能抛出，抛出就无法进行jsp页面回调，所以设置这个标识，0表示无异常，1代表异常
    private String url;             //应该是浏览器能够解析的具体页面路径  相对路径http://image.jt/1212.jpg 
	public Integer getError() {
		return error;
	}
	public void setError(Integer error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


}
