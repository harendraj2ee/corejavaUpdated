package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaBasic {
	final static String salutation = "Hello ";
	public static void main(String[] args) {
		GreetingService greetingService1 = message  ->
		System.out.println(salutation + message);
	    greetingService1.sayMessage("Mahesh");
	    
	    ListLamda.simepleList();
	    FunctionalInterface.functionalInterf();
	}
	interface GreetingService{
		void sayMessage(String message);
	}
}
class ListLamda{
	public static void simepleList(){
		List<String> name = new ArrayList<String>();
		name.add("Suraj");
		name.add("Prakash");
		name.add("Setu");
		name.add("Bholu");
		name.add("Nitish");
		name.add("Ravish Kumar");
		name.forEach(System.out::println); // static method use this types of java 8
		
	}
}

//Functional Interface java 8
class FunctionalInterface{
	public static void functionalInterf(){
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		// Predicate<Integer> predicate = n -> true
	      // n is passed as parameter to test method of Predicate interface
	      // test method will always return true no matter what value n has.
			
	      System.out.println("Print all numbers:");
			
	      //pass n as parameter
	      eval(list, n->true);
			
	      // Predicate<Integer> predicate1 = n -> n%2 == 0
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n%2 comes to be zero
			
	      System.out.println("Print even numbers:");
	      eval(list, n-> n%2 == 0 );
			
	      // Predicate<Integer> predicate2 = n -> n > 3
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n is greater than 3.
			
	      System.out.println("Print numbers greater than 3:");
	      eval(list, n-> n > 3 );
	}
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {

	      for(Integer n: list) {

	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }
}