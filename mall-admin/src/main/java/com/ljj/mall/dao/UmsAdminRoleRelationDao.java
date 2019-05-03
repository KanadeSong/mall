package com.ljj.mall.dao;

import com.ljj.mall.model.UmsAdminRoleRelation;
import com.ljj.mall.model.UmsPermission;
import com.ljj.mall.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @CLassName UmsAdminRoleRelationDao
 * @Description 后台用户与角色管理自定义Dao
 * @Author LeeJack
 * @Date 2019/5/3/003 17:33
 * @Version 1.0
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
