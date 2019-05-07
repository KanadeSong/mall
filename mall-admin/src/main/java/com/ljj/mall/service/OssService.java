package com.ljj.mall.service;

import com.ljj.mall.dto.OssCallbackResult;
import com.ljj.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: oss上传管理Service
 * @author LeeJack
 * @Date 21:57 2019/5/4/004
 */
public interface OssService {
    OssPolicyResult policy();
    OssCallbackResult callback(HttpServletRequest request);
}
