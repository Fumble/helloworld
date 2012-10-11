package com.liutianqing.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;


public class French implements BeanFactoryAware {

	private BeanFactory apc;
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.apc=arg0;

	}
	public BeanFactory getBeanFactory(){
		return apc;
	}
	

}
