package com.ljj.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 订单修改收货人信息参数
 * @author LeeJack
 * @Date 21:44 2019/5/4/004
 */
@Getter
@Setter
public class OmsReceiverInfoParam {
    private Long orderId;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverDetailAddress;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private Integer status;
}
