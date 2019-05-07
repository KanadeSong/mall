package com.ljj.mall.service.impl;

import com.ljj.mall.mapper.CmsPrefrenceAreaMapper;
import com.ljj.mall.model.CmsPrefrenceArea;
import com.ljj.mall.model.CmsPrefrenceAreaExample;
import com.ljj.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 商品优选Service实现类
 * @author LeeJack
 * @Date 22:06 2019/5/4/004
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
