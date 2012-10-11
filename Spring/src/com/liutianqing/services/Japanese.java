package com.liutianqing.services;

public abstract class Japanese implements Person {

	
	public Japanese(){
		System.out.println("spring in defaut constructor...");
	}
	public abstract Axe getAxe();
	@Override
	public void useAxe() {
		System.out.println("Using in "+getAxe()+" working!");
		System.out.println(getAxe().chop());
		// TODO Auto-generated method stub

	}

}
