package com.ljj.mall.dao;

import com.ljj.mall.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName SmsCouponProductRelationDao
 * @Description 优惠券和产品关系自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:32
 * @Version 1.0
 */
public interface SmsCouponProductRelationDao {
    int insertList(@Param("list") List<SmsCouponProductRelation> productRelationList);
}
