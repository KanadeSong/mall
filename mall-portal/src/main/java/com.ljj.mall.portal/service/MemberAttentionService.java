package com.ljj.mall.portal.service;

import com.ljj.mall.portal.domain.MemberBrandAttention;

import java.util.List;

/**
 * @Description: 会员关注Service
 * @author LeeJack
 * @Date 18:46 2019/5/5/005
 */
public interface MemberAttentionService {
    /**
     * 添加关注
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 取消关注
     */
    int delete(Long memberId , Long brandId);

    /**
     * 获取用户关注列表
     */
    List<MemberBrandAttention> list(Long memberId);
}
