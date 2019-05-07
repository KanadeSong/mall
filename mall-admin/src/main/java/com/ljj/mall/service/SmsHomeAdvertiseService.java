package com.ljj.mall.service;

import com.ljj.mall.model.SmsHomeAdvertise;

import java.util.List;

/**
 * @Description: 首页广告管理Service
 * @author LeeJack
 * @Date 21:59 2019/5/4/004
 */
public interface SmsHomeAdvertiseService {
    /**
     * 添加广告
     */
    int create(SmsHomeAdvertise advertise);

    /**
     * 批量删除广告
     */
    int delete(List<Long> ids);

    /**
     * 修改上、下线状态
     */
    int updateStatus(Long id , Integer status);

    /**
     * 获取广告详情
     */
    SmsHomeAdvertise getItem(Long id);

    /**
     * 更新广告
     */
    int update(Long id , SmsHomeAdvertise advertise);

    /**
     * 分页查询广告
     */
    List<SmsHomeAdvertise> list(String name , Integer type , String endTime , Integer pageSize , Integer pageNum);
}
