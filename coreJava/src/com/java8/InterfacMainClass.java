package com.java8;

public class InterfacMainClass {
	public static void main(String[] args) {
		Bihar obj1 ;
		obj1 = new India();
		obj1.saran();
		
		//part 2
//		Tajpur obj2; 
//		obj2 = new Tajpur(){ // Inner Anonymous class
//			public void tajpur(){
//				System.out.println("welcome to Tajpur... Inner Anonymous class ");
//			}
//		};
//		obj2.tajpur();
		
		//Java 8 lemda expression
		
//		Tajpur obj2;
//		obj2 =  () ->{
//			System.out.println("Lemda Expressionn using java 8 Tajpur");
//		};
//		obj2.tajpur();
		
		Tajpur obj2;
		obj2 = () -> System.out.println("Lemda Expression using java 8...");
		obj2.tajpur();
	}
}
interface Bihar{
	void saran();
}
class India implements Bihar{
	public void saran(){
		System.out.println("Welcome to Saran >> ");
	}
}

///////////////////// part 2

interface Tajpur{
	void tajpur();
}
//class Manjhi implements Tajpur{
//	public void tajpur(){
//		System.out.println("Welcome To Tajpur.");
//	}
//}
