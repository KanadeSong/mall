package com.ljj.mall.dao;

import com.ljj.mall.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName PmsProductVertifyRecordDao
 * @Description 商品审核日志自定义dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:32
 * @Version 1.0
 */
public interface PmsProductVertifyRecordDao {
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
