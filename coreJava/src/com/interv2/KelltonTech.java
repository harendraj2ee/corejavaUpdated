package com.interv2;

public class KelltonTech {
	public KelltonTech(String s) {
		System.out.println("KelltonTech() Constructor Called.");
	}
	public KelltonTech() {
		System.out.println("KelltonTech() ==");
	}
	private void printMethod(String s) {
		System.out.println("Local printMethod() called.");
	}
}


class A{ //parent
	public void a() {
		System.out.println("a() method");
	}
}
class B extends A{ //child
	public void b() {
		System.out.println("b() method");
	}
}
class C extends B{ //child
	public void c() {
		System.out.println("c() method");
	}
}