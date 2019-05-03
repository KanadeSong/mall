package com.ljj.mall.dao;

import com.ljj.mall.dto.OmsOrderDeliveryParam;
import com.ljj.mall.dto.OmsOrderDetail;
import com.ljj.mall.dto.OmsOrderQueryParam;
import com.ljj.mall.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName OmsOrderDao
 * @Description 订单自定义查询Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:30
 * @Version 1.0
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
