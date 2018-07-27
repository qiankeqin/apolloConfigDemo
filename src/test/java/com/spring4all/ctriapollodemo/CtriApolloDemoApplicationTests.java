package com.spring4all.ctriapollodemo;

import com.spring4all.ctriapollodemo.demo.ConfigurationPropertiesSample;
import com.spring4all.ctriapollodemo.demo.DataSourceConfigSample;
import com.spring4all.ctriapollodemo.demo.JavaConfigSample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CtriApolloDemoApplicationTests {

	@Autowired
	private JavaConfigSample javaConfigSample;

	@Autowired
	private DataSourceConfigSample dataSourceConfigSample;

	@Autowired
	private ConfigurationPropertiesSample configurationPropertiesSample;

	@Test
	public void test1() {
		System.out.println("hello");
		System.out.println(javaConfigSample.getTimeout());
	}

	@Test
	public void test2() throws IOException, InterruptedException {
		System.out.println(System.in.read());//等待输入
	}


	@Test
	public void test3() throws IOException {
		System.out.println(configurationPropertiesSample);
		System.out.println(System.in.read());
	}

}
