package com.liutianqing.services;

import com.liutianqing.ihm.Gente;

public class American implements Gente {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name+", Hello!";
	}

	@Override
	public String sayGoodBye(String name) {
		// TODO Auto-generated method stub
		return name + ", Byebye!";
	}

}
