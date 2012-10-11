package com.liutianqing.services;

public class Chinese implements Person {

	
	private Axe axe;
	public Chinese(){
		System.out.println("Default constructor Chinese");
	}
	
	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		System.out.println("Spring injection dependancy....");
		this.axe = axe;
	}

	public void useAxe() {
		System.out.println(axe.chop());

	}

}
