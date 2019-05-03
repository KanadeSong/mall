package com.ljj.mall.dao;

import com.ljj.mall.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName CmsSubjectProductRelationDao
 * @Description 自定义商品和专题关系操作
 * @Author LeeJack
 * @Date 2019/5/3/003 17:30
 * @Version 1.0
 */
public interface CmsSubjectProductRelationDao {
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);

}
