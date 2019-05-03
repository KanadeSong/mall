package com.ljj.mall.dao;

import com.ljj.mall.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

/**
 * @CLassName PmsProductDao
 * @Description 商品自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:31
 * @Version 1.0
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
