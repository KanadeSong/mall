package com.ljj.mall.service;

import com.ljj.mall.dto.PmsProductCategoryParam;
import com.ljj.mall.dto.PmsProductCategoryWithChildrenItem;
import com.ljj.mall.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 产品分类Service
 * @author LeeJack
 * @Date 21:58 2019/5/4/004
 */
public interface PmsProductCategoryService {
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    @Transactional
    int update(Long id , PmsProductCategoryParam pmsProductCategoryParam);

    List<PmsProductCategory> getList(Long parentId , Integer pageSize , Integer pageNum);

    int delete(Long id);

    PmsProductCategory getItem(Long id);

    int updateNavStatus(List<Long> ids , Integer navStatus);

    int updateShowStatus(List<Long> ids , Integer showStatus);

    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
