package com.wen.aaa;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test_ioc {
	// 1. ͨ��������õ�IOC���������Ķ���
		@Test
		public void testIOC() throws Exception {
			// ��������
			// User user = new User();
			// ���ڣ��Ѷ���Ĵ�������spring��IOC����
			Resource resource = new ClassPathResource("com/wen/aaa/applicationContext.xml");
			// ������������(Bean�Ĺ���), IOC���� = ������ + applicationContext.xml
			BeanFactory factory = new XmlBeanFactory(resource);
			// �õ����������Ķ���
			User user = (User) factory.getBean("user");
			System.out.println(user.getId());
		}
		
		//2. �����㣩ֱ�ӵõ�IOC�������� 
		@Test
		public void testAc() throws Exception {
			// �õ�IOC��������
			int a = 0;
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/wen/aaa/applicationContext.xml");
			// �������л�ȡbean
			User user = (User) ac.getBean("user");
			System.out.println(user);
		}
		
		@Test
		public void testIOC2() throws Exception {
			// �õ�IOC��������  ����ʵ���࣬��ΪҪ�������ٵķ�����
			ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/wen/aaa/applicationContext.xml");
			System.out.println("-----��������-----");
			
			// �������л�ȡbean
			User user1 = (User) ac.getBean("user");
			User user2 = (User) ac.getBean("user");
			
			System.out.println(user1);
			System.out.println(user2);
			
			// ������������ 
			ac.destroy();
		}


		
}
