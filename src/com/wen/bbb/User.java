package com.wen.bbb;

public class User {
	private int id;
	private String name;

	public User() {
		super();
		System.out.println("-User���󴴽����޲�����������");
	}

	public User(int id, String name) {
		System.out.println("-----User���󴴽�����������������");
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public void init_user() {
		System.out.println("��������֮�󣬳�ʼ��");
	}

	public void destroy_user() {
		System.out.println("IOC�������٣�user�������!");
	}

}
