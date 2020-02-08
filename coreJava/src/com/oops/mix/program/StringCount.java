package com.oops.mix.program;
public class StringCount {
	public static void main(String[] args) {
		countString();
		countString2();
	}
	protected static int countString() {
		String str="The best of both worlds";
		str=str.replace(" ", "");
		 int count=str.length();
		 System.out.println("count >> "+count);
		return count;
	}
	private static void countString2() {
		String str="Harendra Kumar Sah Software Developer";
		int len =str.length();
		int count=0;
		for(int i=0;i<len; i++) {
			char ch=str.charAt(i);
			if(ch!=' ') 
				count++;
		}	
		System.out.println("count "+count);
	}
}
