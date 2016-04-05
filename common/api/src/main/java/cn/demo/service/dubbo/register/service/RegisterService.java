/*
 * Project: demo-service
 * 
 * File Created at 2016年04月05日
 * 
 * Copyright 2016 naitang.com All right reserved. This software is the
 * confidential and proprietary information of naitang.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with naitang.com .
 */
package cn.demo.service.dubbo.register.service;

/**
 * Created by TianMing <tianming@naitnag.com> on 16/4/5.
 *
 * @Type RegisterService
 * @Desc 普通类型转换
 * @Author TianMing <tianming@naitnag.com>
 * @Date 2016-04-05
 * @Version V1.0
 */
public interface RegisterService {
    /**
     * @param name
     * @return String
     */
    public String hello(String name);
}
