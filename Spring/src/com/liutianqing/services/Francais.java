package com.liutianqing.services;

import com.liutianqing.ihm.Gente;

public class Francais implements Gente {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name+", Bonjour!";
	}

	@Override
	public String sayGoodBye(String name) {
		// TODO Auto-generated method stub
		return name+" ,Au revoir!";
	}

}
