package com.ljj.mall.dao;

import com.ljj.mall.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName PmsProductAttributeDao
 * @Description 自定义商品属性Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:31
 * @Version 1.0
 */
public interface PmsProductAttributeDao {
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
