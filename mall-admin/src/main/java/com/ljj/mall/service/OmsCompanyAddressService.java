package com.ljj.mall.service;

import com.ljj.mall.model.OmsCompanyAddress;

import java.util.List;

/**
 * @Description: 收货地址管Service
 * @author LeeJack
 * @Date 21:57 2019/5/4/004
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
