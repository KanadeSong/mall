package com.ljj.mall.portal.dao;

import com.ljj.mall.model.OmsOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 订单商品信息自定义Dao
 * @author LeeJack
 * @Date 19:03 2019/5/5/005
 */
public interface PortalOrderItemDao {
    int insertList(@Param("list") List<OmsOrderItem> list);
}
