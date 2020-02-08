package com.core.java;

public class Recursion {
	static int count=0;
	static void p() {
		count++;
		System.out.println("hello p...");
		if(count<=5) {
			p();
		}
	}
	static int factorial(int n) {
		if(n==1)
			return 1;
		else 
			return (n * (factorial(n-1)));
	}
	// do need full fibonecci series... logic 
	
	
	public static void main(String args[]) {
		System.out.println("factorial is : >> "+factorial(5));
		p();
	}

}
