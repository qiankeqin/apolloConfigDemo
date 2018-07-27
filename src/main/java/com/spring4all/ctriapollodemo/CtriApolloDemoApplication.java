package com.spring4all.ctriapollodemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@EnableApolloConfig
@SpringBootApplication
public class CtriApolloDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtriApolloDemoApplication.class, args);
	}
}
