package cn.tedu.utils;


public class SmsReturn {
    private String message;
    private String requestid;
    private String bizid;
    private String code;
    public void setMessage(String message) {
        this.message = message;
    }
    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }
    public void setBizid(String bizid) {
        this.bizid = bizid;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public String getRequestid() {
        return requestid;
    }
    public String getBizid() {
        return bizid;
    }
    public String getCode() {
        return code;
    }
}
