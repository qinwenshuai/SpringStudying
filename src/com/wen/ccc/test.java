package com.wen.ccc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	// ������������
		private ApplicationContext ac = new ClassPathXmlApplicationContext("com/wen/ccc/bean_p.xml");
		
		@Test
		public void testExecuteAction() {
			// �������л�ȡAction
			UserAction userAction = (UserAction) ac.getBean("userAction");
			userAction.execute();
			System.out.println(ac.getBean("user"));
		}


}
