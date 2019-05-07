package com.ljj.mall.dto;

import com.ljj.mall.model.SmsCoupon;
import com.ljj.mall.model.SmsCouponProductCategoryRelation;
import com.ljj.mall.model.SmsCouponProductRelation;

import java.util.List;

/**
 * @Description: 优惠券信息封装，包括绑定商品和绑定分类
 * @author LeeJack
 * @Date 21:47 2019/5/4/004
 */
public class SmsCouponParam extends SmsCoupon {
    //优惠券绑定的商品
    private List<SmsCouponProductRelation> productRelationList;
    //优惠券绑定的商品分类
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;

    public List<SmsCouponProductRelation> getProductRelationList() {
        return productRelationList;
    }

    public void setProductRelationList(List<SmsCouponProductRelation> productRelationList) {
        this.productRelationList = productRelationList;
    }

    public List<SmsCouponProductCategoryRelation> getProductCategoryRelationList() {
        return productCategoryRelationList;
    }

    public void setProductCategoryRelationList(List<SmsCouponProductCategoryRelation> productCategoryRelationList) {
        this.productCategoryRelationList = productCategoryRelationList;
    }
}
