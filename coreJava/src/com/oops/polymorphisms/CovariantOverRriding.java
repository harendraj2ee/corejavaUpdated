package com.oops.polymorphisms;
class FirstClass{
	FirstClass get() {
		return this;
	}
}
public class CovariantOverRriding extends FirstClass {
	CovariantOverRriding get() {
		return this;
	}
	void getMSG() {
		System.out.println("Welcome to Covariant type Overriding ");
	}
	
	public static void main(String[] args) {
		new CovariantOverRriding().get().getMSG();
	}
}
