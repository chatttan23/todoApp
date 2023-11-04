package com.gaurav.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("gaurav");
		boolean isValidPassword = password.equalsIgnoreCase("subedi");
		
		
		return isValidUserName && isValidPassword;
	}
}
