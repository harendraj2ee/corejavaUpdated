package com.harendra.mocktest;
class A{}
class B extends A{}
class C extends B{}
class D extends C{}
class Super{}
class Sub extends Super{}
class A1{B1 b;} //has a relationship
class B1{}
class Animal{
	String name ="animal";
	 String makeNoise() { return "generic noise";}
}
class Dog extends Animal{
	 String makeNoise() { return "bark";}
}
public class InheritanceMockTest {
	public static void main(String args[]) {
		Super x;
		Sub y;
		B b = new C();
		A a = b;
		if(a instanceof A) { System.out.println("A");}
		if(a instanceof B) { System.out.println("B");}
		if(a instanceof C) { System.out.println("C");}
		if(a instanceof D) { System.out.println("D");}
	//----
		Animal an = new Dog();
		an.makeNoise();
		System.out.println("name >> "+an.name + " "+an.makeNoise());
		System.out.println("jjjj "+args[1]);
	}

}
