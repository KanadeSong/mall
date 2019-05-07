package com.ljj.mall.dto;

import com.ljj.mall.model.PmsProductCategory;

import java.util.List;

/**
 * @author LeeJack
 * @Date 21:46 2019/5/4/004
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
