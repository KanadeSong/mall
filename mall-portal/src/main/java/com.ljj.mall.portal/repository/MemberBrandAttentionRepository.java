package com.ljj.mall.portal.repository;

import com.ljj.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Description: 会员关注Repository
 * @author LeeJack
 * @Date 17:44 2019/5/5/005
 */
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention, String> {
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId , Long brandId);
    int deleteByMemberIdAndBrandId(Long memberId , Long brandId);
    List<MemberBrandAttention> findByMemberId(Long memberId);
}
