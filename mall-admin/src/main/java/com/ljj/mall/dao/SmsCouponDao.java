package com.ljj.mall.dao;

import com.ljj.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * @CLassName SmsCouponDao
 * @Description 优惠券管理自定义查询Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:32
 * @Version 1.0
 */
public interface SmsCouponDao {
    SmsCouponParam getItem(@Param("id") Long id);
}
