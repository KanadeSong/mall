package com.ljj.mall.portal.service;

import com.ljj.mall.portal.domain.MemberProductCollection;

import java.util.List;

/**
 * 会员收藏Service
 * Created by ljj on 2018/8/2.
 */
public interface MemberCollectionService {
    int addProduct(MemberProductCollection productCollection);

    int deleteProduct(Long memberId , Long productId);

    List<MemberProductCollection> listProduct(Long memberId);
}
