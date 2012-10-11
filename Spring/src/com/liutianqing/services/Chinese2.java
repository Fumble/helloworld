package com.liutianqing.services;

public class Chinese2 implements Person {

	private Axe axe;
	public Chinese2(){
		
	}
	public Chinese2(Axe axe){
		this.axe=axe;
	}
	@Override
	public void useAxe() {
		// TODO Auto-generated method stub
		System.out.println(axe.chop());

	}

}
