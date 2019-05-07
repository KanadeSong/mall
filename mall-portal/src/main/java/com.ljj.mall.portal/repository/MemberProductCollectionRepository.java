package com.ljj.mall.portal.repository;

import com.ljj.mall.portal.domain.MemberProductCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Description: 商品收藏Repository
 * @author LeeJack
 * @Date 17:45 2019/5/5/005
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection, String> {
    MemberProductCollection findByMemberIdAndProductId(Long memberId , Long productId);
    int deleteByMemberIdAndProductId(Long memberId , Long productId);
    List<MemberProductCollection> findByMemberId(Long memberId);
}
