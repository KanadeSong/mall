package com.ljj.mall.dao;

import com.ljj.mall.dto.OmsOrderReturnApplyResult;
import com.ljj.mall.dto.OmsReturnApplyQueryParam;
import com.ljj.mall.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName OmsOrderReturnApplyDao
 * @Description 订单退货申请自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:30
 * @Version 1.0
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
