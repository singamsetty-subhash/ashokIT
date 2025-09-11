package com.pack.beans;

public class User {
	PasswordEncoder passwordencoder;

	public User(PasswordEncoder passwordencoder) {
		super();
		this.passwordencoder = passwordencoder;
	}

	
	public void login(String Username, String password) {
		System.out.println("login success...");
		System.out.println("username = " + Username);
		System.out.println("password = " +  passwordencoder.encodePassword(password));
	}

}
