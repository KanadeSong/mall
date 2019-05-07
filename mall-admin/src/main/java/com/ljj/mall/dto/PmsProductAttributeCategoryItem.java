package com.ljj.mall.dto;

import com.ljj.mall.model.PmsProductAttribute;
import com.ljj.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * @Description: 包含有分类下属性的dto
 * @author LeeJack
 * @Date 21:45 2019/5/4/004
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    private List<PmsProductAttribute> productAttributeList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
