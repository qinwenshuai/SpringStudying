package com.wen.ccc;

public class UserService {
	private UserDao userDao; // = new UserDao();
	// IOC������Ĵ�������spring���ⲿ�������
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void save() {
		userDao.save();
	}


}
