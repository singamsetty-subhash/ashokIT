package com.pack.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordEncoder {
	public String encodePassword(String password) {
		Encoder encoder=Base64.getEncoder();
		byte[] bytes=password.getBytes();
		String encodedPassword=encoder.encodeToString(bytes);
		return encodedPassword;
			}

}
