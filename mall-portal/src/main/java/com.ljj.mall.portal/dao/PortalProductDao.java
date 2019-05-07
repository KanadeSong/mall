package com.ljj.mall.portal.dao;

import com.ljj.mall.portal.domain.CartProduct;
import com.ljj.mall.portal.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 前台系统自定义商品Dao
 * @author LeeJack
 * @Date 19:03 2019/5/5/005
 */
public interface PortalProductDao {
    CartProduct getCartProduct(@Param("id") Long id);
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);
}
