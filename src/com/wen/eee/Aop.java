package com.wen.eee;

import org.springframework.stereotype.Component;

@Component
public class Aop {
	// �ظ�ִ�еĴ���
		public void begin(){
			System.out.println("��ʼ����/�쳣");
		}
		public void commite(){
			System.out.println("�ύ����/�ر�");
		}


}
