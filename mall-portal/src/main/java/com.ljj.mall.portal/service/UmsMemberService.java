package com.ljj.mall.portal.service;

import com.ljj.mall.common.api.CommonResult;
import com.ljj.mall.model.UmsMember;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 会员管理Service
 * @author LeeJack
 * @Date 18:49 2019/5/5/005
 */
public interface UmsMemberService {
    /**
     * 根据用户名获取会员
     */
    UmsMember getByUsername(String username);

    /**
     * 根据会员编号获取会员
     */
    UmsMember getById(Long id);

    /**
     * 用户注册
     */
    @Transactional
    CommonResult register(String username , String password , String telephone , String authCode);

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 修改密码
     */
    @Transactional
    CommonResult updatePassword(String telephone , String password , String authCode);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();

    /**
     * 根据会员id修改会员积分
     */
    void updateIntegration(Long id , Integer integration);
}
