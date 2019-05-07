package com.ljj.mall.service;

import com.ljj.mall.model.PmsSkuStock;

import java.util.List;

/**
 * @Description: sku商品库存管理Service
 * @author LeeJack
 * @Date 21:58 2019/5/4/004
 */
public interface PmsSkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     */
    List<PmsSkuStock> getList(Long pid , String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long pid , List<PmsSkuStock> skuStockList);
}
