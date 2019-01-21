package com.miaoshaproject.service;

import com.miaoshaproject.dataobject.UserDO;
import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @Author: Alan.W
 * @Date: 2019/1/15 14:46
 */
public interface UserService {

    /**
     * 通过用户id获取用户
     * @param id
     * @return
     */
    UserModel getUserById(Integer id);

    /**
     * 用户注册
     * @param userModel
     * @throws BusinessException
     */
    void register(UserModel userModel) throws BusinessException;

    /**
     * 用户登录
     * @param telphone 用户注册手机
     * @param encrptPassword 用户加密后的密码
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;

}
