package com.liutianqing.services;

import org.springframework.beans.factory.BeanNameAware;

public class Chinois implements BeanNameAware {

	private String beanName;
	@Override
	public void setBeanName(String arg0) {
		this.beanName=arg0;
		// TODO Auto-generated method stub

	}
	public void init(){
		System.out.println("En Cours de Initialising .................");
	}
	public void close(){
		System.out.println("Destroy the bean   closing...............");
	}
	public void info(){
		System.out.println("Chinois the real class "+",  ID : "+beanName);
	}

}
