package com.liutianqing.services;

import java.util.Date;



public class Human implements Person {

	private String name;
	private int age;
	private Date naissance;
	public Human(int i, String name, Date date) {
		this.age=i;
		this.naissance=date;
		this.name=name;
		// TODO Auto-generated constructor stub
	}


	public Human() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getNaissance() {
		return naissance;
	}


	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}


	public Axe getAxe() {
		return axe;
	}


	public void setAxe(Axe axe) {
		this.axe = axe;
	}


	private Axe axe;
	

	@Override
	public void useAxe() {
		System.out.println("I m "+this.name+axe.chop());

	}

}
