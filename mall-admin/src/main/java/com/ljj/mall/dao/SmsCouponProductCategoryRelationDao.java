package com.ljj.mall.dao;

import com.ljj.mall.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName SmsCouponProductCategoryRelationDao
 * @Description 优惠券和商品分类关系自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:32
 * @Version 1.0
 */
public interface SmsCouponProductCategoryRelationDao {
    int insertList(@Param("list") List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
