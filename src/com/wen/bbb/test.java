package com.wen.bbb;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	// 测试：对象创建
		@Test
		public void testIOC() throws Exception {
			// 创建IOC容器对象
			ApplicationContext ac = new ClassPathXmlApplicationContext("com/wen/bbb/bean.xml");
			// 获取容器中的对象
			User user = (User) ac.getBean("user5");
			System.out.println(user);
		}


}
