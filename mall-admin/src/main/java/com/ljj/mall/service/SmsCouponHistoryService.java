package com.ljj.mall.service;

import com.ljj.mall.model.SmsCouponHistory;

import java.util.List;

/**
 * @Description: 优惠券领取记录管理Service
 * @author LeeJack
 * @Date 21:58 2019/5/4/004
 */
public interface SmsCouponHistoryService {
    /**
     * 分页查询优惠券领取记录
     * @param couponId 优惠券id
     * @param useStatus 使用状态
     * @param orderSn 使用订单号码
     */
    List<SmsCouponHistory> list(Long couponId , Integer useStatus , String orderSn , Integer pageSize , Integer pageNum);
}
