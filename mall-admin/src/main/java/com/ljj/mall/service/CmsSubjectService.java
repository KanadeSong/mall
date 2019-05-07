package com.ljj.mall.service;

import com.ljj.mall.model.CmsSubject;

import java.util.List;

/**
 * @Description: 商品专题Service
 * @author LeeJack
 * @Date 21:56 2019/5/4/004
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword , Integer pageNum , Integer pageSize);
}
