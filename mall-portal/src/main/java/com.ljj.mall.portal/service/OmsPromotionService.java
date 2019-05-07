package com.ljj.mall.portal.service;

import com.ljj.mall.model.OmsCartItem;
import com.ljj.mall.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * @Description: 促销管理Service
 * @author LeeJack
 * @Date 18:47 2019/5/5/005
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
