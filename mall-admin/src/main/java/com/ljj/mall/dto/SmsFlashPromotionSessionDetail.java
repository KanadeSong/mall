package com.ljj.mall.dto;

import com.ljj.mall.model.SmsFlashPromotionSession;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 包含商品数量的场次信息
 * @author LeeJack
 * @Date 21:47 2019/5/4/004
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    private Integer productCount;
}
