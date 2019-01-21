package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Author: Alan.W
 * @Date: 2019/1/21 20:39
 */
public interface OrderService {

    OrderModel createOrder(Integer itemId, Integer userId, Integer amount) throws BusinessException;
}
