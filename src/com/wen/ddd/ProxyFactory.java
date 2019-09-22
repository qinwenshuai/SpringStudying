package com.wen.ddd;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {

	private Object target;
	public ProxyFactory(Object target){
		this.target = target;
	}
	
	// ��Ŀ����󴴽��������
	public Object getProxyInstance(){
		//1. ������
		Enhancer en = new Enhancer();
		//2. ���ø��ࣨ�����෽ʽ���ڴ��ж�̬�������������Ҫ֪������ĸ��࣬�˴�Ϊtarget������UserDao��ʵ������
		en.setSuperclass(target.getClass());
		//3. ���ûص�������ִ��target����ķ���ʱ���ᴥ���������еķ�����
		en.setCallback(this);
		//4. ��������(�������)
		return en.create();
	}
	
	/*
	 * CGLib���÷ǳ��ײ���ֽ��뼼��������Ϊһ���ഴ��һ�����࣬���������в��÷������صļ����������и��෽���ĵ��ã���˳��ֲ������߼���
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("��ʼ����.....");
		// ִ��Ŀ�����ķ���
	Object returnValue = method.invoke(target, args);
		System.out.println("�ύ����.....");
		return returnValue;
	}


}
