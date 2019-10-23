package com.appleye.mall.service;

import com.appleye.mall.common.api.CommonResult;

/**
 * 会员管理Service
 * @author Appleye
 * @time 2019/7/31 0031 16:24
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);
}
