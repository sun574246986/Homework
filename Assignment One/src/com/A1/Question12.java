package com.A1;

public class Question12 {
	public static boolean isnumber(String str) {
		for(int i = 0; i < str.length(); i ++) {
			System.out.println(str.charAt(i));
			if(!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isnumber2(String str) {
		for(int i = 0; i < str.length(); i ++) {
			System.out.println(str.charAt(i));
			if(!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
