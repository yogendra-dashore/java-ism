package com.util;

public class Validations {

	public static boolean isEmpty(String data) {
		if(data == null || data.trim().length() == 0) {
			return false;
		}
		return false;
	}
	
	public static boolean isAlpha(String data) {
	String alpha = "[a-zA-Z]+";
	return data.matches(alpha);
	
	}
	}
	

