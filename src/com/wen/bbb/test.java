package com.wen.bbb;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	// ���ԣ����󴴽�
		@Test
		public void testIOC() throws Exception {
			// ����IOC��������
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/wen/bbb/bean.xml");
			// ��ȡ�����еĶ���
			User user = (User) ac.getBean("user5");
			System.out.println(user);
		}


}
