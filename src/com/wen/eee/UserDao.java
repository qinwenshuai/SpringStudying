package com.wen.eee;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {

	// �ظ�ִ�д����γɵ�һ����
	@Resource
	private Aop aop;

	@Override
	public void save() {
		aop.begin();
		System.out.println("-----����ҵ�񣺱��棡����------");
		aop.commite();
	}

}
