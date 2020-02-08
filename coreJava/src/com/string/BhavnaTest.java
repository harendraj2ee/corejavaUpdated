package com.string;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
abstract class S{
	public  final  void m() {
		System.out.println("Hey absract....");
	}
}
class S2 extends S{
	void m1() {
		System.out.println("Check S2...");
	}
}

public class BhavnaTest  {
	public static void main(String[] args) {
		S2 s = new S2();
		s.m();
		s.m1();
		dublicatStringSet();
		dublicateFind();
		removeDubliArr();
		bhavnaCorportaString();
	}
	static void removeDubliArr() {
		System.out.println();
		int arr[] = {1,2,3,4,5,6,7,8,9,8,3,2,2,2,3,34};
        List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7,8,9,8,3,2,2,2,3,34,1,3,4,2,1,5,6,8,8,3,4,5,13);
        System.out.println("numbers >>> "+numbers);
        //System.out.println("List without duplicates: " + selectDistinct(numbers));

	}
	
	static void dublicatStringSet() {
		String s = "Harendra raja Singh ((***))";
		char [] ch =s.toCharArray();
		Set<Character> toChar = new LinkedHashSet<Character>();
		for(char c : ch) {
			toChar.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(Character cr : toChar) {
			sb.append(cr);
		}
		System.out.println("Remove String >> "+sb.toString());
	}
	static void dublicateFind() {
		String ss ="Kishoraora Kumar PUJJABB";
		String s ="";
		int len = ss.length();
		for(int i=0; i<len; i++) {
			char ch = ss.charAt(i);
			if(s.indexOf(ch)==-1)
				s = s+ch;
		}
		System.out.print("Remove Dublicate >> "+s);
	}
	
	

	static void bhavnaCorportaString() {
		System.out.println(" ...");
		String s = new String("X");
		System.out.println("s >> "+s);
		String s1 = new String("Y");
		System.out.println("s1 >> "+s1);
		s=s1;
		
		System.out.println("Match >> "+s);
		StringBuffer sb = new StringBuffer("XYZ");
		System.out.println("sb >> "+sb);
		String s2 = new String("ZYZ");
		System.out.println("s2 >> "+s2);
	}
}
