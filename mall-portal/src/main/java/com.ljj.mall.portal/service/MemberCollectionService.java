package com.ljj.mall.portal.service;

import com.ljj.mall.portal.domain.MemberProductCollection;

import java.util.List;

/**
 * @Description: 会员收藏Service
 * @author LeeJack
 * @Date 18:46 2019/5/5/005
 */
public interface MemberCollectionService {
    int addProduct(MemberProductCollection productCollection);

    int deleteProduct(Long memberId , Long productId);

    List<MemberProductCollection> listProduct(Long memberId);
}
