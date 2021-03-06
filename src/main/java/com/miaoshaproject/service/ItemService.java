package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * @Author: Alan.W
 * @Date: 2019/1/21 15:56
 */
public interface ItemService {

    // 创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    // 商品列表浏览
    List<ItemModel> listItem();

    // 商品详情浏览
    ItemModel getItemById(Integer id);

    // 扣减库存
    boolean decreaseStock(Integer itemId, Integer amount);

    // 下单成功销量增加
    void increaseSales(Integer itemId, Integer amount);

}
