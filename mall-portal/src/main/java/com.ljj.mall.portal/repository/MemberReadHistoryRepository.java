package com.ljj.mall.portal.repository;

import com.ljj.mall.portal.domain.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @Description: 会员商品浏览历史Repository
 * @author LeeJack
 * @Date 17:46 2019/5/5/005
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
