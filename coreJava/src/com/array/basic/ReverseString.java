package com.array.basic;

public class ReverseString {

	public static void main(String[] args) {
		String r ="Harendra Kumar Sah I aM weLL";
		res(r);
		System.out.println(res(r));
	}

	public static String res(String str) {
		String rev1 ="";
		int len = str.length();
		for(int i=0; i<len; i++) {
			char ch =str.charAt(i);
			rev1=ch+rev1;
		}
		return rev1;
	}

}
