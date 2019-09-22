package com.wen.eee;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {

	// 重复执行代码形成的一个类
	@Resource
	private Aop aop;

	@Override
	public void save() {
		aop.begin();
		System.out.println("-----核心业务：保存！！！------");
		aop.commite();
	}

}
