package com.wen.fff;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	ApplicationContext ac = 
			new ClassPathXmlApplicationContext("com/wen/fff/bean.xml");

		// Ŀ�������ʵ�ֽӿڣ�spring���Զ�ѡ��JDK����
		@Test
		public void testApp() {
			IUserDao userDao = (IUserDao) ac.getBean("userDao");
			System.out.println(userDao.getClass());//$Proxy001  
			userDao.save();
		}
		
		// Ŀ�����û��ʵ�ֽӿڣ� spring���á�cglib����
		@Test
		public void testCglib() {
			OrderDao orderDao = (OrderDao) ac.getBean("orderDao");
			System.out.println(orderDao.getClass());
			orderDao.save();
		}


}
