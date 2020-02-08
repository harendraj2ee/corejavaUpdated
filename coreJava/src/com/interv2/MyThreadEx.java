package com.interv2;

import java.util.Scanner;

public class MyThreadEx {
	public static void main(String args[]) {
		String str ="";
		Scanner in = new Scanner(System.in);
		String s =in.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			str=ch+str;
			//System.out.println("string :" +str);
			if(str.contentEquals(s))
				System.out.println("Polydrome");
			else
				System.out.println("Not Polydrome");
		}
	}

}
