package com.ljj.mall.portal.service;

import com.ljj.mall.common.api.CommonResult;
import com.ljj.mall.model.SmsCouponHistory;
import com.ljj.mall.portal.domain.CartPromotionItem;
import com.ljj.mall.portal.domain.SmsCouponHistoryDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 用户优惠券管理Service
 * @author LeeJack
 * @Date 18:48 2019/5/5/005
 */
public interface UmsMemberCouponService {
    /**
     * 会员添加优惠券
     */
    @Transactional
    CommonResult add(Long couponId);

    /**
     * 获取优惠券列表
     * @param useStatus 优惠券的使用状态
     */
    List<SmsCouponHistory> list(Integer useStatus);

    /**
     * 根据购物车信息获取可用优惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList , Integer type);
}
