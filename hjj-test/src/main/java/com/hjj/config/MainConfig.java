package com.hjj.config;

import com.hjj.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @author haojunjie
 * @create 2022-06-15 0:21
 */
@ComponentScan("com.hjj")
@Configuration
public class MainConfig {

	@Bean
	public User user () {
		User user = new User();

		user.setId(1L);
		user.setUserName("haojunjie");

		return user;
	}
}
