package com.wen.eee;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	ApplicationContext ac = 
			new ClassPathXmlApplicationContext("com/wen/eee/bean2.xml");

		@Test
		public void testApp() {
			IUserDao userDao = (IUserDao) ac.getBean("userDao");
			userDao.save();
		}
		
		@Test
		public void testApp2() {
		IUserDao userDao = (IUserDao) ac.getBean("userDao_proxy");
			//System.out.println(userDao.getClass());
			userDao.save();
		}



}
