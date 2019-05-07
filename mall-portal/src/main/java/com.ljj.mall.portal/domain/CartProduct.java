package com.ljj.mall.portal.domain;

import com.ljj.mall.model.PmsProduct;
import com.ljj.mall.model.PmsProductAttribute;
import com.ljj.mall.model.PmsSkuStock;

import java.util.List;

/**
 * @Description: 购物车中选择规格的商品信息
 * @author LeeJack
 * @Date 17:46 2019/5/5/005
 */
public class CartProduct extends PmsProduct {
    private List<PmsProductAttribute> productAttributeList;
    private List<PmsSkuStock> skuStockList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }
}
