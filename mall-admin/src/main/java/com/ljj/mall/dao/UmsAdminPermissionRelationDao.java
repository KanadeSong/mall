package com.ljj.mall.dao;

import com.ljj.mall.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName UmsAdminPermissionRelationDao
 * @Description 用户权限自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:33
 * @Version 1.0
 */
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
