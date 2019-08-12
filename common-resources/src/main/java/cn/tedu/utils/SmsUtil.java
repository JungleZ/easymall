package cn.tedu.utils;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.rmi.ServerException;

public class SmsUtil {

    private static ObjectMapper objMapper = new ObjectMapper();
    public static String sendSms(String code, String phone) {
        DefaultProfile profile = DefaultProfile.getProfile("default", "LTAIKb0knPtKSHFI",
                "45cIPyrUh7uhOVnAAUYNDzk72svRQf");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "default");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "small");
        request.putQueryParameter("TemplateCode", "SMS_172207681");
        request.putQueryParameter("TemplateParam","{\"code\":\"" + code + "\"}");

        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            return objMapper.readValue(response.getData().toLowerCase(), SmsReturn.class).getRequestid();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
