package com.ljj.mall.portal.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @Description: 首页当前秒杀场次信息
 * @author LeeJack
 * @Date 17:50 2019/5/5/005
 */
@Getter
@Setter
public class HomeFlashPromotion {
    private Date startTime;
    private Date endTime;
    private Date nextStartTime;
    private Date nextEndTime;
    //属于该秒杀活动的商品
    private List<FlashPromotionProduct> productList;
}
