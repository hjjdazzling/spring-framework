package com.hjj.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author haojunjie
 * @create 2022-07-10 12:52
 */
public class TestFactoryBean implements FactoryBean<Address> {

	@Override
	public Address getObject() throws Exception {
		Address address = new Address();
		address.setCity("成都");

		return address;
	}

	@Override
	public Class<?> getObjectType() {
		return Address.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
