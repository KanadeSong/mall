package com.ljj.mall.dao;

import com.ljj.mall.model.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName CmsPrefrenceAreaProductRelationDao
 * @Description 自定义优选和商品关系操作
 * @Author LeeJack
 * @Date 2019/5/3/003 17:26
 * @Version 1.0
 */
public interface CmsPrefrenceAreaProductRelationDao {
    int insertList(@Param("list") List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList);

}
