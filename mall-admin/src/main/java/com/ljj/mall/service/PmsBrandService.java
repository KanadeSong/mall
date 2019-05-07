package com.ljj.mall.service;

import com.ljj.mall.dto.PmsBrandParam;
import com.ljj.mall.model.PmsBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 商品品牌Service
 * @author LeeJack
 * @Date 21:57 2019/5/4/004
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrandParam pmsBrandParam);
    @Transactional
    int updateBrand(Long id , PmsBrandParam pmsBrandParam);

    int deleteBrand(Long id);

    int deleteBrand(List<Long> ids);

    List<PmsBrand> listBrand(String keyword , int pageNum , int pageSize);

    PmsBrand getBrand(Long id);

    int updateShowStatus(List<Long> ids , Integer showStatus);

    int updateFactoryStatus(List<Long> ids , Integer factoryStatus);
}
