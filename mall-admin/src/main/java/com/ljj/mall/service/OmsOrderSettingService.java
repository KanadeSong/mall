package com.ljj.mall.service;

import com.ljj.mall.model.OmsOrderSetting;

/**
 * @Description: 订单设置Service
 * @author LeeJack
 * @Date 21:57 2019/5/4/004
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id , OmsOrderSetting orderSetting);
}
