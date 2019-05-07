package com.ljj.mall.portal.domain;

import com.ljj.mall.model.PmsProduct;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Description: 秒杀信息和商品对象封装
 * @author LeeJack
 * @Date 17:48 2019/5/5/005
 */
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct{
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
}
