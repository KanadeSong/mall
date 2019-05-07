package com.ljj.mall.dto;

import com.ljj.mall.model.OmsOrder;
import com.ljj.mall.model.OmsOrderItem;
import com.ljj.mall.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * @Description: 订单详情信息
 * @author LeeJack
 * @Date 21:42 2019/5/4/004
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
