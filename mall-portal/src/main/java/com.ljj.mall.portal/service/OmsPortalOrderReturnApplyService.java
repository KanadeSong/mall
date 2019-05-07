package com.ljj.mall.portal.service;

import com.ljj.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * @Description: 订单退货管理Service
 * @author LeeJack
 * @Date 18:47 2019/5/5/005
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
