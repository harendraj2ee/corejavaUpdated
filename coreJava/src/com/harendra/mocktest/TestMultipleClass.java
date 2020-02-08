package com.harendra.mocktest;
interface Hero{
	abstract void m();	
}
class Director implements Hero{
	public void m() {
		System.out.println("test m....");
	}
}
class Directtor2 extends Director{
	public void m1() {
		System.out.println("m1 ....");
	}
}
class Director3 extends Directtor2{
	
}
class Director4 extends Director3{
	 void dd() {
		System.out.println("ddd method. ..  ");
	}
}
class Director5{
	
}

public class TestMultipleClass {
	public static void main(String args[]) {
		Hero h = new Director();
		Director d = new Director();
		Director d2 = new Directtor2();
		Director3 d3 = new Director4();
		Director5 d5 = new Director5();
		h.m();
		if(h instanceof Hero) {
			System.out.println("Welcome Hero..");
		}
		if(d instanceof Director) {
			System.out.println("director");
		}
		if(d2 instanceof Directtor2) {
			System.out.println("Director2.. ");
		}
		if(d3 instanceof Director3) {
			System.out.println("Director3...");
		}
		if(d3 instanceof Director4) {
			System.out.println("directore444...");
		}
		if(d5 instanceof Director5) {
			System.out.println("Director5... ");
		}
	}	
}
