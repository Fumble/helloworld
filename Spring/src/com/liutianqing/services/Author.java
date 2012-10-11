package com.liutianqing.services;

import java.util.List;

public class Author implements Person {

	private String name;
	private List<String> books;
	private Axe axe;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		System.out.println("I m "+name+"\n Im working "+axe.chop());
		// TODO Auto-generated method stub

	}

}
