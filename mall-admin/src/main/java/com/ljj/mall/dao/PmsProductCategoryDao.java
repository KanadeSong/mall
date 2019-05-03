package com.ljj.mall.dao;

import com.ljj.mall.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @CLassName PmsProductCategoryDao
 * @Description 商品分类自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:31
 * @Version 1.0
 */
public interface PmsProductCategoryDao {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
