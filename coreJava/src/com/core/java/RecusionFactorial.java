package com.core.java;

public class RecusionFactorial {

	public static void main(String[] args) {
		
		factorial();
		
		int fact=1;
		int number =4;
		fact = FactorialRescursion.factorialRec(number);
		System.out.println(fact);
	}
	public static void factorial(){
		int fact=1;
		for(int i=1; i<=5; i++){
			fact =fact*i;
		}
		System.out.println(fact);
	}
}
class FactorialRescursion{
	public static int factorialRec(int n){
		if (n == 0) 
			return 1;
		else 
			return (n*(factorialRec(n-1)));
	}
}