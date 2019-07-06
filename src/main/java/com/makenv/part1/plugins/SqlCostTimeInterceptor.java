package com.makenv.part1.plugins;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

import java.util.Properties;

/**
 * @Author: lilimin
 * @Date: 2019/7/6 18:48
 */
public class SqlCostTimeInterceptor implements Interceptor {

    public Object intercept(Invocation invocation) throws Throwable {
        return null;
    }

    public Object plugin(Object target) {
        return null;
    }

    public void setProperties(Properties properties) {

    }
}
