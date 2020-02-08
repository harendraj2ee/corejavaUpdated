package com.java8;

import java.util.Arrays;
import java.util.List;

interface Phone{
	void call();
	 void message(String s);
	 default void defalutMeth(){
		 System.out.println("defalut method test..");
	 }
}
class  AndroidJava implements Phone{
	public void call(){
		System.out.println("Calling....");
	}
	public void message(String name){
		name =" Hello java 8";
		System.out.println("name >> "+name);
	}
}
////////// mamin class method
public class DefaultMethod {
	public static void main(String[] args){
		Phone p = new AndroidJava();
		p.call();
		p.message("");
		p.defalutMeth();
		Looping lp  = new Looping();
		lp.m();
		
		Vehicle vechile = new Car();
		vechile.print();

		//FourWheeler fourwheeler = new Car();
		//fourwheeler.print();
		
	}

}
class Looping {
	public  void m(){
		List<String> list = Arrays.asList("Harendra","Vivek","Rahul","Pooja","Sohan");
		//External looping
		for(int i=0; i<list.size(); i++){
			System.out.println("i >> " + list.get(i));
		}
		//External looping
		for(String str : list){
			System.out.println("Enhance LoopStr >> " + str);
		}
		list.forEach(i -> System.out.println(i));// Internal looping java 8
	}
}

interface Vehicle {
	default void print(){
		System.out.println(" I am a vehicle!");
	}
	 static void blowHorn(){
	      System.out.println("  Blowing horn!!!");
	}
}
interface FourWheeler {
	default void print(){
		System.out.println(" I am a four wheeler! ");
	}
}
class Car implements Vehicle,FourWheeler{
	public void print(){
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
	    System.out.println(" I am a four wheeler car vehicle!");
	}
}