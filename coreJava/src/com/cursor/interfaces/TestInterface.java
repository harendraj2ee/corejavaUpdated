package com.cursor.interfaces;

interface Printable{
	void print();
	default void method1() {
		System.out.println("default interface in java8");
	}
	 public static void method2() {
		System.out.println("static interface int java8. ");
	}
}

class A implements Printable{
	public void print() {
		System.out.println("hello print ");
	
	}
}
//using third user.
public class TestInterface {
	public static void main(String[] args) {
		//------------------------------1
		A a = new A();
		a.print();
		a.method1();
		Printable.method2();
		//-----------------------------2
		//using third user..
		Drawable d1 = new Circle();// In real scenario, Object is provied by method e.x. getDrawable() 
		d1.draw();
		
		
		//-----------------------------3
		Bank sbi = new SBI();
		sbi.rateOfInterest();
		System.out.println("SBI Bank Interest Rate >> "+sbi.rateOfInterest());
		
		//----------------------------------4
		// Mutiple inheritance Interface program -4
		A2 a2 = new A2();
		a2.print();
		a2.show();
		
		//------------------------------- 5 
		//Defalut method java 8
		Drawable1 dr = new Rectangle1();
		dr.draw();
		dr.msg();
		
		//--------------------------------6
		//java static method in interface java 8
		Drawable2 dw2 = new Rectangle2();
		dw2.show();
		Drawable2.cube(5);
		System.out.println("Drawable2.cube(5) >>> "+Drawable2.cube(5));
		


	}

}
//first user
interface Drawable{
	void draw();
}
//second user
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectagnle...");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing Circle ...");
	}
}

//3 program Bank
interface Bank{
	float rateOfInterest();
}
class SBI implements Bank{
	public float rateOfInterest() {
		return 9.40f;
	}
}
class PNB implements Bank{
	public float rateOfInterest() {
		return 6.20f;
	}
}

// Mutiple inheritance Interface program -4
interface Printable1{
	public void print();
}
interface Showable{
	public void show();
}
class A2 implements Printable1,Showable{
	public void print() {
		System.out.println("print Hello...");
	}
	public void show() {
		System.out.println("show Welcome Harendra");
	}
}

// default method in interface - 5

interface Drawable1{
	void draw();
	default void msg() {
		System.out.println("Defalut method..");
	}
}
class Rectangle1  implements Drawable1{
	public void draw() {
		System.out.println("drawing1 rectangle1..");
	}
}


// static interface method -6
interface Drawable2{
	void show();
	static int cube(int i) {
		return i*i*i;
	}
}
class Rectangle2 implements Drawable2{
	public void show() {
		System.out.println("Drawable2 Rectanle2...");
	}
}