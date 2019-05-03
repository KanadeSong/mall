package com.ljj.mall.dao;

import com.ljj.mall.model.PmsProductCategoryAttributeRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName PmsProductCategoryAttributeRelationDao
 * @Description 自定义商品分类和属性关系Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:31
 * @Version 1.0
 */
public interface PmsProductCategoryAttributeRelationDao {
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}
