package com.cursor.interfaces;
//Example 1
abstract class Bike4{
	abstract void run();
}
class Honda4 extends Bike4{
	void run() {
		System.out.println("running safely..");
	}
}

// example 2
abstract class Shape{
	abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectanglea extends Shape{
	 void draw() {
		System.out.println("drawing rectangle... ");
	}
}
class Circlea extends Shape{
	void draw() {
		System.out.println("drawing circle...");
	}
}

// example 3
abstract class Bank22{
	abstract int getRateOfInterest();
}
class SBI22 extends Bank22{
	int getRateOfInterest() {
		return 7;
	}
}
class PNB22 extends Bank22{
	int getRateOfInterest() {
		return 9;
	}
}

//Example of an abstract class that has abstract and non-abstract methods  ex. 4..

abstract class Bike2{
	 Bike2() {
		 System.out.println("Bike2 is created...");
	}
	 abstract void run();
	 void changeGear() {
		 System.out.println("Gear Changed...");
	 }
}
//Creating a Child class which inherits Abstract class  
class Honda extends Bike2{
	void run() {
		System.out.println("Running Safely....");
	}
}
//Example 5..
interface Mix{
	void a();
	void b();
	void c();
	void d();
}

abstract class MixAbstract implements Mix{
	public void c() {
		System.out.println("I am in C");
	}
}
class Simpl extends MixAbstract{
	public void a() {
		System.out.println("I am in a");
	}
	public void b() {
		System.out.println("I am in b.");
	}
	public void d() {
		System.out.println("I am in d.. ");
	}
	
}

public class TestAbstract {
	public static void main(String[] args) {
		//---------------------example 1
		Bike4 b = new Honda4();
		b.run();
		
		//In real scenario, method is called by programmer or user  exampel - 2
		Shape s = new Circlea();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();
		
		//------------------------------- example 3
		Bank22 b2;
		b2 = new SBI22();
		System.out.println("InterestRate of SBI >> "+b2.getRateOfInterest()+" %");
		b2 = new PNB22();
		System.out.println("InterestRate of PNB >> "+b2.getRateOfInterest()+" %");
		
		//------------------------------exmaple 4
		Bike2 b3 = new Honda();
		b3.run();
		b3.changeGear();
		
		//------------------ example 5..
		Mix mx = new Simpl();
		mx.a();
		mx.b();
		mx.c();
		mx.d();
	}
}
