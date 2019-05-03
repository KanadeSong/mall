package com.ljj.mall.dao;

import com.ljj.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * @CLassName PmsProductAttributeCategoryDao
 * @Description 自定义商品属性分类Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:31
 * @Version 1.0
 */
public interface PmsProductAttributeCategoryDao {
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
