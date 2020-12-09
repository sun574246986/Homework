package com.A1;

public class Question14 {
	public static int[] mergetwoarray(int[] a , int[] b) {
		int a1 = a.length;
		int b1 = b.length;
		
		int c1 = a1 + b1;
		
		int[] c = new int[c1];
		
		for(int i = 0; i < a1; i ++) {
			c[i] = a[i];
		}
		
		for(int i = 0; i < b1; i ++) {
			c[a1+i] = b[i];
		}
		
		return c;
	}
	
}
