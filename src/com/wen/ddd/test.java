package com.wen.ddd;

import org.junit.Test;

public class test {
	
	@Test
	public void test1() {
		// Ŀ�����
				UserDao target = new UserDao();
				// class cn.itcast.c_cglib.UserDao
				System.out.println(target.getClass());
				// �������
				UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
				// UserDao���ࣺclass cn.atcast.c_cglib.UserDao$$EnhancerByCGLIB$$25d4aeab
				System.out.println(proxy.getClass());
				// ִ�д������ķ���
				proxy.save();
			}

	}


