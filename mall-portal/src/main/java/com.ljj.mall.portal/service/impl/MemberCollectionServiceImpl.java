package com.ljj.mall.portal.service.impl;

import com.ljj.mall.portal.domain.MemberProductCollection;
import com.ljj.mall.portal.repository.MemberProductCollectionRepository;
import com.ljj.mall.portal.service.MemberCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 会员收藏Service实现类
 * @author LeeJack
 * @Date 18:49 2019/5/5/005
 */
@Service
public class MemberCollectionServiceImpl implements MemberCollectionService {
    @Autowired
    private MemberProductCollectionRepository productCollectionRepository;

    @Override
    public int addProduct(MemberProductCollection productCollection) {
        int count = 0;
        MemberProductCollection findCollection = productCollectionRepository.findByMemberIdAndProductId(productCollection.getMemberId(), productCollection.getProductId());
        if (findCollection == null) {
            productCollectionRepository.save(productCollection);
            count = 1;
        }
        return count;
    }

    @Override
    public int deleteProduct(Long memberId, Long productId) {
        return productCollectionRepository.deleteByMemberIdAndProductId(memberId, productId);
    }

    @Override
    public List<MemberProductCollection> listProduct(Long memberId) {
        return productCollectionRepository.findByMemberId(memberId);
    }
}
