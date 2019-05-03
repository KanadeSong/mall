package com.ljj.mall.dao;

import com.ljj.mall.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName PmsProductAttributeValueDao
 * @Description 商品参数，商品自定义规格属性Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:31
 * @Version 1.0
 */
public interface PmsProductAttributeValueDao {
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
