package com.ljj.mall.dto;

import com.ljj.mall.model.OmsCompanyAddress;
import com.ljj.mall.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 申请信息封装
 * @author LeeJack
 * @Date 21:44 2019/5/4/004
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
