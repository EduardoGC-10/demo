package com.switz.crypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BCryptPasswordEncoder pe=new BCryptPasswordEncoder();
		System.out.println(pe.encode("admin"));
	}

}
