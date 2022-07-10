package com.hjj;

import com.hjj.bean.Address;
import com.hjj.bean.TestFactoryBean;
import com.hjj.bean.User;
import com.hjj.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author haojunjie
 * @create 2022-06-15 0:20
 */
public class Main {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-test.xml");

		User user = (User) applicationContext.getBean("user");

		Object testFactoryBean = applicationContext.getBean("&testFactoryBean");


		Object testFactoryBean2 = applicationContext.getBean("testFactoryBean");

		System.out.println(user);
		System.out.println(testFactoryBean);
	}
}
