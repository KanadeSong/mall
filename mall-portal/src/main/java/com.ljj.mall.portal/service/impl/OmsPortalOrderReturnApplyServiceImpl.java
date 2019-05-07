package com.ljj.mall.portal.service.impl;

import com.ljj.mall.mapper.OmsOrderReturnApplyMapper;
import com.ljj.mall.model.OmsOrderReturnApply;
import com.ljj.mall.portal.domain.OmsOrderReturnApplyParam;
import com.ljj.mall.portal.service.OmsPortalOrderReturnApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description: 订单退货管理Service实现类
 * @author LeeJack
 * @Date 18:50 2019/5/5/005
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
