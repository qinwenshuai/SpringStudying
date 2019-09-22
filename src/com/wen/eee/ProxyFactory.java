package com.wen.eee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	// Ŀ�����
		private static Object target;
		private static Aop aop;
		// ���ɴ������ķ���
		public static Object getProxyInstance(Object target_,Aop aop_){
			
			target = target_;
			aop = aop_;
			
			return Proxy.newProxyInstance(
					target.getClass().getClassLoader(), 
					target.getClass().getInterfaces(), 
					new InvocationHandler() {
						@Override
						public Object invoke(Object proxy, Method method, Object[] args)
								throws Throwable {
							aop.begin();// ִ���ظ�����
							// ִ��Ŀ�����ķ���
							Object returnValue = method.invoke(target, args);
							aop.commite(); // ִ���ظ�����
							return returnValue;
						}
					});
		}


}
