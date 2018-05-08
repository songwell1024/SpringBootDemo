package com.demo.springbootdemo02;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.demo.springbootdemo02.ymlTest.person;


/**
 * SpringBoot的单元测试
 * 使用的是SpringRunner.class而用的不是spring的junit的功能
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo02ApplicationTests {

	/**
	 * @Autowired自动注入
	 */
	@Autowired
	person person;

	@Autowired
	org.springframework.context.ApplicationContext ioc;

	@Test
	public void testHelloService(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);


	}

	@Test
	public void contextLoads() {
       System.out.print(person);
	}

	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void loggingTest(){

		/**
		 * 日志的级别由低到高
		 * 可以调整日志的级别，日志的输出默认输出当前级别及更高的级别
		 */
		logger.debug("这是debug日志。。。");  //跟踪日志
		logger.trace("这是trace日志。。。");
		//SpringBoot默认的是info级别的
		logger.info("这是info日志。。。");  //自定义的
		logger.warn("这是warn日志");
		logger.error("这是error日志");
	}

}
