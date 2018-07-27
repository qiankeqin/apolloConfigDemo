package com.spring4all.ctriapollodemo.demo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: ctri-apollo-demo
 * @description: JavaConfig例子
 * @author: qiankeqin
 * @create: 2018-07-23 19:55
 **/
@Component
public class JavaConfigSample {

    @ApolloConfig
    private Config config;

    @Value("${timeout:100}")
    private String timeout;

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
}
