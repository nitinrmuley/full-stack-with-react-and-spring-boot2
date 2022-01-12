package com.example.restfulwebservices.jwt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {

	public static void main(String[] args) {

		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		String encodedString = encoder.encode("password@123");
		System.out.println("encoded is "+ encodedString);
	}

}
