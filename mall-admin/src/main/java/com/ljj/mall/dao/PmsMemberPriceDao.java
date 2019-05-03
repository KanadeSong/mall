package com.ljj.mall.dao;

import com.ljj.mall.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName PmsMemberPriceDao
 * @Description 自定义会员价格Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:30
 * @Version 1.0
 */
public interface PmsMemberPriceDao {
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);

}
