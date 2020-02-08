package com.oops.polymorphisms;
class Adder{
	static int add(int a,int b) {
		a=10;
		b=20;
		return a+b;
	}
	static int add(int a,int b,int c) {
		return (a+b+c);
	}
	static double add(int a,int b,int c,int d) {
		return(a+b+c+d);
	}
	static double add(double i,double j,double k,double l ) {
		return(i+j+k+l);
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		
		System.out.println("addTwo Number >> "+Adder.add(3, 1));
		System.out.println("AddThree number >> "+Adder.add(50, 60, 20));
		System.out.println("addFour number >> "+Adder.add(5, 10, 15, 20));
		System.out.println("addFour decimal number >> "+Adder.add(2.5, 5.5, 3.5, 4));
	}
}
