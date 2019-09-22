package com.wen.ccc;

public class UserAction {
	// Service: springIOCÈÝÆ÷×¢Èë
		private UserService userService;
	public void setUserService(UserService userService) {
			this.userService = userService;
		}

		public String execute() {
			userService.save();
			return null;
		}

}
