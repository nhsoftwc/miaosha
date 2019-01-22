package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Author: Alan.W
 * @Date: 2019/1/21 20:39
 */
public interface OrderService {

    // 通过前端url上传过来秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动已开始
    OrderModel createOrder(Integer itemId, Integer userId, Integer promoId, Integer amount) throws BusinessException;
}
