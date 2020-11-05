package com.in28minutes.login;

public class UserValidationService{
	public boolean isUserValid(String user, String password) {
		if(user.equals("igor") && password.equals("dummy"))
			return true;
		return false;
	}
}