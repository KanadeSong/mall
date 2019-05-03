package com.ljj.mall.dao;

import com.ljj.mall.model.UmsPermission;
import com.ljj.mall.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName UmsRolePermissionRelationDao
 * @Description 后台用户角色管理自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:33
 * @Version 1.0
 */
public interface UmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
