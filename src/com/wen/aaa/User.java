package com.wen.aaa;

public class User {
	private int id;
	private String name;

	public User() {
		super();
	System.out.println("------User���󴴽�------");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void init_user() {
		System.out.println("��������֮�󣬳�ʼ��");
	}
	public void destroy_user() {
	System.out.println("IOC�������٣�user�������!");
	}


}
