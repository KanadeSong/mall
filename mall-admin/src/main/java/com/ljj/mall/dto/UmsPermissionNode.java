package com.ljj.mall.dto;

import com.ljj.mall.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author LeeJack
 * @Date 21:47 2019/5/4/004
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
