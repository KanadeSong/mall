package com.ljj.mall.common.api;

/**
 * @CLassName CommonResult
 * @Description 通用返回对象
 * @Author LeeJack
 * @Date 2019/5/2/002 23:10
 * @Version 1.0
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T date;

    protected CommonResult() {
    }

    protected CommonResult(long code , String message , T date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }

    /**
     * @Description: 成功返回结果
     * @Param [data 获取的数据]
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 0:02 2019/5/3/003
     */
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    /**
     * @Description: 成功返回结果
     * @Param [data获取的数据, message提示信息]
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 0:04 2019/5/3/003
     */
    public static <T> CommonResult<T> success(T data,String message){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),message,data);
    }

    /**
     * @Description: 失败返回结果
     * @Param [errorCode 错误码]
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 0:07 2019/5/3/003
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode){
        return new CommonResult<T>(errorCode.getCode(),errorCode.getMessage(),null);
    }

    /**
     * @Description: 失败返回结果
     * @Param [message 提示信息]
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 0:08 2019/5/3/003
     */
    public static <T> CommonResult<T> failed(String  message){
        return new CommonResult<T>(ResultCode.FAILED.getCode(),message,null);
    }

    /**
     * @Description: 失败返回结果
     * @Param []
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 0:10 2019/5/3/003
     */
    public static <T> CommonResult<T> failed(){
        return failed(ResultCode.FAILED);
    }

    /**
     * @Description: 参数验证失败返回结果
     * @Param []
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 0:12 2019/5/3/003
     */
    public static <T> CommonResult<T> validateFailed(){
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * @Description: 参数验证失败返回结果
     * @Param [message 提示信息]
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 13:13 2019/5/3/003
     */
    public static <T> CommonResult<T> validateFailed(String message){
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(),message,null);
    }

    /**
     * @Description: 未登录返回结果
     * @Param [date]
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 13:15 2019/5/3/003
     */
    public static <T> CommonResult<T> unauthorized(T data){
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(),ResultCode.UNAUTHORIZED.getMessage(),data);
    }

    /**
     * @Description: 未授权返回结果
     * @Param [data]
     * @return com.ljj.mall.common.api.CommonResult<T>
     * @author LeeJack
     * @Date 13:16 2019/5/3/003
     */
    public static <T> CommonResult<T> forbidden(T data){
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(),ResultCode.FORBIDDEN.getMessage(),data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
