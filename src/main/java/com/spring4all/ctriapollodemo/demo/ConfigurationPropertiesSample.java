package com.spring4all.ctriapollodemo.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @program: ctri-apollo-demo
 * @description: ConfigurationProperties+prefix
 * @author: qiankeqin
 * @create: 2018-07-24 09:02
 **/
@Component
@ConfigurationProperties(prefix = "redis.cache")
@EnableApolloConfig("application")
public class ConfigurationPropertiesSample {

    private int expireSeconds;
    private String clusterNodes;
    private int commandTimeout;

    private Map<String, String> someMap = new HashMap<>();
    private List<String> someList = new LinkedList<>();


    //下面是get/set方法
    public int getExpireSeconds() {
        return expireSeconds;
    }

    public void setExpireSeconds(int expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public String getClusterNodes() {
        return clusterNodes;
    }

    public void setClusterNodes(String clusterNodes) {
        this.clusterNodes = clusterNodes;
    }

    public int getCommandTimeout() {
        return commandTimeout;
    }

    public void setCommandTimeout(int commandTimeout) {
        this.commandTimeout = commandTimeout;
    }

    public Map<String, String> getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map<String, String> someMap) {
        this.someMap = someMap;
    }

    public List<String> getSomeList() {
        return someList;
    }

    public void setSomeList(List<String> someList) {
        this.someList = someList;
    }

    @Override
    public String toString() {
        return "ConfigurationPropertiesSample{" +
                "expireSeconds=" + expireSeconds +
                ", clusterNodes='" + clusterNodes + '\'' +
                ", commandTimeout=" + commandTimeout +
                ", someMap=" + someMap +
                ", someList=" + someList +
                '}';
    }
}
