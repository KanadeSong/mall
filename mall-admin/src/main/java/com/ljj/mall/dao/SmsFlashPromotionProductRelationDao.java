package com.ljj.mall.dao;

import com.ljj.mall.dto.SmsFlashPromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName SmsFlashPromotionProductRelationDao
 * @Description 限时购商品关联自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:33
 * @Version 1.0
 */
public interface SmsFlashPromotionProductRelationDao {
    /**
     * 获取限时购及相关商品信息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}
