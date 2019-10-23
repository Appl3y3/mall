package com.appleye.mall.common.api;

/**
 * 封装了API的错误码
 * @author Appleye
 * @time 2019/7/30 0030 16:23
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
