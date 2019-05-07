package com.ljj.mall.dto;

/**
 * @Description: OssCallbackParam
 * @author LeeJack
 * @Date 21:44 2019/5/4/004
 */
public class OssCallbackParam {
    private String callbackUrl;
    private String callbackBody;
    private String callbackBodyType;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackBody() {
        return callbackBody;
    }

    public void setCallbackBody(String callbackBody) {
        this.callbackBody = callbackBody;
    }

    public String getCallbackBodyType() {
        return callbackBodyType;
    }

    public void setCallbackBodyType(String callbackBodyType) {
        this.callbackBodyType = callbackBodyType;
    }
}
