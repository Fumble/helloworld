package com.liutianqing.services;

public class Dog implements Being {

	private String msg;
	
	public void setMsg(String msg){
		this.msg=msg;
	}
	@Override
	public void testBeing() {
		System.out.println(msg+" dog love bones");

	}

}
