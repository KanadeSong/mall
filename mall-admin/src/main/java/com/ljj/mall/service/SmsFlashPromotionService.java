package com.ljj.mall.service;

import com.ljj.mall.model.SmsFlashPromotion;

import java.util.List;

/**
 * @Description: 限时购活动管理Service
 * @author LeeJack
 * @Date 21:59 2019/5/4/004
 */
public interface SmsFlashPromotionService {
    /**
     * 添加活动
     */
    int create(SmsFlashPromotion flashPromotion);

    /**
     * 修改指定活动
     */
    int update(Long id , SmsFlashPromotion flashPromotion);

    /**
     * 删除单个活动
     */
    int delete(Long id);

    /**
     * 修改上下线状态
     */
    int updateStatus(Long id , Integer status);

    /**
     * 获取详细信息
     */
    SmsFlashPromotion getItem(Long id);

    /**
     * 分页查询活动
     */
    List<SmsFlashPromotion> list(String keyword , Integer pageSize , Integer pageNum);
}
