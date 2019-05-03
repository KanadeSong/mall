package com.ljj.mall.dao;

import com.ljj.mall.model.PmsSkuStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName PmsSkuStockDao
 * @Description 自定义商品sku库存Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:32
 * @Version 1.0
 */
public interface PmsSkuStockDao {
    /**
     * 批量插入操作
     */
    int insertList(@Param("list") List<PmsSkuStock> skuStockList);

    /**
     * 批量插入或替换操作
     */
    int replaceList(@Param("list")List<PmsSkuStock> skuStockList);
}
