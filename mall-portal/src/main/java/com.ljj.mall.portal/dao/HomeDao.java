package com.ljj.mall.portal.dao;

import com.ljj.mall.model.CmsSubject;
import com.ljj.mall.model.PmsBrand;
import com.ljj.mall.model.PmsProduct;
import com.ljj.mall.portal.domain.FlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 首页内容管理自定义Dao
 * @Param
 * @return
 * @author LeeJack
 * @Date 19:02 2019/5/5/005
 */
public interface HomeDao {

    /**
     * 获取推荐品牌
     */
    List<PmsBrand> getRecommendBrandList(@Param("offset") Integer offset , @Param("limit") Integer limit);

    /**
     * 获取秒杀商品
     */
    List<FlashPromotionProduct> getFlashProductList(@Param("flashPromotionId") Long flashPromotionId , @Param("sessionId") Long sessionId);

    /**
     * 获取新品推荐
     */
    List<PmsProduct> getNewProductList(@Param("offset") Integer offset , @Param("limit") Integer limit);
    /**
     * 获取人气推荐
     */
    List<PmsProduct> getHotProductList(@Param("offset") Integer offset , @Param("limit") Integer limit);

    /**
     * 获取推荐专题
     */
    List<CmsSubject> getRecommendSubjectList(@Param("offset") Integer offset , @Param("limit") Integer limit);
}
