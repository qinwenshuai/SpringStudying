package com.wen.aaa;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test_ioc {
	// 1. 通过工厂类得到IOC容器创建的对象
		@Test
		public void testIOC() throws Exception {
			// 创建对象
			// User user = new User();
			// 现在，把对象的创建交给spring的IOC容器
			Resource resource = new ClassPathResource("com/wen/aaa/applicationContext.xml");
			// 创建容器对象(Bean的工厂), IOC容器 = 工厂类 + applicationContext.xml
			BeanFactory factory = new XmlBeanFactory(resource);
			// 得到容器创建的对象
			User user = (User) factory.getBean("user");
			System.out.println(user.getId());
		}
		
		//2. （方便）直接得到IOC容器对象 
		@Test
		public void testAc() throws Exception {
			// 得到IOC容器对象
			int a = 0;
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/wen/aaa/applicationContext.xml");
			// 从容器中获取bean
			User user = (User) ac.getBean("user");
			System.out.println(user);
		}
		
		@Test
		public void testIOC2() throws Exception {
			// 得到IOC容器对象  【用实现类，因为要调用销毁的方法】
			ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/wen/aaa/applicationContext.xml");
			System.out.println("-----容器创建-----");
			
			// 从容器中获取bean
			User user1 = (User) ac.getBean("user");
			User user2 = (User) ac.getBean("user");
			
			System.out.println(user1);
			System.out.println(user2);
			
			// 销毁容器对象 
			ac.destroy();
		}


		
}
