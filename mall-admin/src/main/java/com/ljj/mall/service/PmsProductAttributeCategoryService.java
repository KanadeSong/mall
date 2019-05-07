package com.ljj.mall.service;

import com.ljj.mall.dto.PmsProductAttributeCategoryItem;
import com.ljj.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * @Description: 商品属性分类Service
 * @author LeeJack
 * @Date 21:58 2019/5/4/004
 */
public interface PmsProductAttributeCategoryService {
    int create(String name);

    int update(Long id , String name);

    int delete(Long id);

    PmsProductAttributeCategory getItem(Long id);

    List<PmsProductAttributeCategory> getList(Integer pageSize , Integer pageNum);

    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
