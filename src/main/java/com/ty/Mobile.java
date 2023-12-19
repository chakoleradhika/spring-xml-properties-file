package com.ty;

public class Mobile {
	private int cost;
	private String name;

	public Mobile(int cost, String name) {
		super();
		this.cost = cost;
		this.name = name;
	}

	public void display() {
		System.out.println("name : " + name);
		System.out.println("cost : " + cost);
	}

}
