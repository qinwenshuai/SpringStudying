package com.wen.ccc;

public class User {
	private int id;
	private String name;
	
	//ͨ������ע������ֵ
	public void setId(int id) {
		this.id = id;
	}
	//ͨ������ע������ֵ
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public User() {
		super();
	System.out.println("---User���󴴽����޲���������");
	}
	
	public User(int id, String name) {
	System.out.println("User���󴴽�����������������");
		this.id = id;
		this.name = name;
	}

	public void init_user() {
		System.out.println("��������֮�󣬳�ʼ��");
	}
	public void destroy_user() {
		System.out.println("IOC�������٣�user�������!");
	}


}
