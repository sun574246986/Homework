package com.A1;

public class Question15 {
	
	public static int maxtwo(int[] a) {
		int temp;
		int l = a.length;
		for(int i = 0; i < l ; i ++ ) {
			
			for(int j = i + 1; j < l;j ++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		return a[l-2];
	}
}
