package com.miaoshaproject.error;

/**
 * @Author: Alan.W
 * @Date: 2019/1/15 15:31
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
