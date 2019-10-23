package com.appleye.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @author Appleye
 * @time 2019/7/30 0030 14:11
 */
@Configuration
@MapperScan("com.appleye.mall.mbg.mapper")
public class MyBatisConfig {
}
