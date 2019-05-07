package com.ljj.mall.service;

import com.ljj.mall.dto.OmsOrderReturnApplyResult;
import com.ljj.mall.dto.OmsReturnApplyQueryParam;
import com.ljj.mall.dto.OmsUpdateStatusParam;
import com.ljj.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * @Description: 退货申请管理Service
 * @author LeeJack
 * @Date 21:57 2019/5/4/004
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam , Integer pageSize , Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id , OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
