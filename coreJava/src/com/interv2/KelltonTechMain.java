package com.interv2;
public class KelltonTechMain {
	public static void main(String[] args) {
		KelltonTech k1 = new KelltonTech();
		KelltonTech k2 =  new KelltonTech2();
		//KelltonTech2 k3 = new KelltonTech(); //incomptible type
		KelltonTech2 k4 = new KelltonTech2();
		
		System.out.println("\n------------------------------\n");
		A a = new A();
		A a1 = new B();
		A a2 = new C(); 
		//B b = new A(); //mismatch
		B b1 = new B();
		B b2 = new C();
		
		C c = new C();
		//C c1 = new B(); //mismatch
		a.a();
		a1.a();
		a2.a();
		b1.a();
		b1.b();
		b2.a();
		b2.b();
		c.a();
		c.b();
		c.c();
		System.out.println("\n-------------------------------");
		KelltonTech kt = new KelltonTech("1 - Constructor ");
		KelltonTech kt2 = new KelltonTech2("2 - Constructor");
		//KelltonTech2 kt3 = new KelltonTech("null"); //missed matach constructor
		KelltonTech2 kt4 = new KelltonTech2("3- Constructor");
		kt4.printMethod2("KelltonTech2 printMethod()");
	}
}
