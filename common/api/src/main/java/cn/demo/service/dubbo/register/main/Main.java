/*
 * Project: demo-service
 * 
 * File Created at 2016年04月05日
 * 
 * Copyright 2016 demo.com All right reserved. This software is the
 * confidential and proprietary information of demo.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with demo.com .
 */
package cn.demo.service.dubbo.register.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by TianMing <tianming@demo.com> on 16/4/5.
 *
 * @Type Main
 * @Desc 普通类型转换
 * @Author TianMing <tianming@demo.com>
 * @Date 2016-04-05
 * @Version V1.0
 */
public class Main {

    /**
     * @param args
     * @return void
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring/dubbo.xml" });
        context.start();
        System.out.println("按任意键退出");
        System.in.read();
    }

}
