package com.java8;
public class Lamda1 {		
	public static void main(String[] args) {
		System.out.println("java 8");
		Lamda1 obj = new Lamda1();
		MathOperation addition = (int a, int b) -> a + b;//with type declaration
		MathOperation subtraction = (a,b) -> a - b; //without declaration
		MathOperation multiplication = (int a, int b) -> { return a * b; }; ////with return statement along with curly braces
		MathOperation division = (int a, int b) -> a / b; //without return statement and with curly braces
		System.out.println("10 + 5 = " + obj.operate(10, 5, addition));
		System.out.println("10 - 5 = " + obj.operate(10, 5, subtraction));
		System.out.println("10 * 5 = " + obj.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + obj.operate(10, 5, division));
		
		GreetingService greetingService1 = message -> //without parenthesis
		System.out.println("Hello  " + message);
		
		GreetingService greetingService2 =  (message) -> //with parenthesis
		System.out.println("Hello " + message);
		
		greetingService1.sayMessage("Harendra");
		greetingService2.sayMessage("Developer");
		
	}
	interface MathOperation {
		int operation(int a, int b);
	}
	interface GreetingService {
		void sayMessage(String message);
	}
	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
		
	}
}
