package com.example.demo.model;

/**
 * Created by AnQiLin on 2018/7/27.
 * restful返回
 */
public class ApiResult {
    public ApiResult() {

    }

    public ApiResult(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static ApiResult ok(String msg) {
        return new ApiResult(200, null, msg);
    }

    public static ApiResult ok(String msg, Object data) {
        return new ApiResult(200, data, msg);
    }

    //返回码
    private Integer code;

    //数据体
    private Object data;

    //信息
    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
