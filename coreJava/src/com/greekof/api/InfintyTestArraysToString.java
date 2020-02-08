package com.greekof.api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingDeque;

public class InfintyTestArraysToString {
	public static void main(String args[]){
		reversDubleSpace();
		infinity();
		arrayToDeepString();
		 if(isPrime(11))  
	         System.out.println(" true") ; 
	         else 
	         System.out.println(" false"); 
	}
	
	
	public static void reversDubleSpace() {
		String s="HARENDRA KUMAR";
		s.replaceAll(" ", "k");
		System.out.println(s);
		char[] ch=s.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char ch3 : ch) {
			charSet.add(ch3);
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
			
		}
		System.out.println(sb.toString());
		
	}
	
	// function check whether a number   is prime or not 
    static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
       
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
       
        return true; 
    } 
	public static void arrayToDeepString() {
		int arr[]= {4,5,62,15,23,50,10};
		System.out.println(arr.toString());
		String str = Arrays.toString(arr);
		System.out.println("Int array as String in java  >> "+str);
		
		// Convert two dimensional array to String in Java 
		int[][] twoD = { {100, 200, 300, 400, 500}, {300, 600, 900, 700, 800},}; 
		System.out.println("twoD >> "+twoD.toString()); 
		String twoDString = Arrays.toString(twoD);
		System.out.println("twoDString >> "+twoDString);
		String deepString =	Arrays.deepToString(twoD);
		System.out.println("int array as deepToString String >>   "+deepString);
		/*StringTokenizer sToknzer = new StringTokenizer(deepString);
        while(sToknzer.hasMoreTokens()){
            System.out.println(sToknzer.nextToken());
        }*/
			
	}
	public static void infinity() {
		double inf = Double.POSITIVE_INFINITY;
		System.out.println(inf + 5);
		System.out.println(inf - inf); // same as Double.NaN
		System.out.println(inf * -1); // same as Double.NEGATIVE_INFINITY
	}
}
