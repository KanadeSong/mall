package com.ljj.mall.portal.service;

import com.ljj.mall.portal.domain.MemberReadHistory;

import java.util.List;

/**
 * @Description: 会员浏览记录管理Service
 * @author LeeJack
 * @Date 18:46 2019/5/5/005
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
