package com.ljj.mall.dto;

import com.ljj.mall.model.PmsProduct;
import com.ljj.mall.model.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 限时购及商品信息封装
 * @author LeeJack
 * @Date 21:47 2019/5/4/004
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation{
    @Getter
    @Setter
    private PmsProduct product;
}
