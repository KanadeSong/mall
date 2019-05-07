package com.ljj.mall.search.dao;

import com.ljj.mall.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 搜索系统中的商品管理自定义Dao
 * @author LeeJack
 * @Date 21:17 2019/5/6/006
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
