package com.ljj.mall.portal.dao;

import com.ljj.mall.portal.domain.SmsCouponHistoryDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 会员优惠券领取历史自定义Dao
 * @author LeeJack
 * @Date 19:03 2019/5/5/005
 */
public interface SmsCouponHistoryDao {
    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);
}
