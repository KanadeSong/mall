package com.ljj.mall.service.impl;

import com.ljj.mall.mapper.OmsCompanyAddressMapper;
import com.ljj.mall.model.OmsCompanyAddress;
import com.ljj.mall.model.OmsCompanyAddressExample;
import com.ljj.mall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 收货地址管理Service实现类
 * @author LeeJack
 * @Date 22:09 2019/5/4/004
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
