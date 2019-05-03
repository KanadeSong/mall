package com.ljj.mall.dao;

import com.ljj.mall.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName OmsOrderOperateHistoryDao
 * @Description 订单操作记录自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:30
 * @Version 1.0
 */
public interface OmsOrderOperateHistoryDao {
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);

}
