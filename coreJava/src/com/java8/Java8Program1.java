
package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Program1{
	public static void main(String[] args) {
		m1();
		m2();
	}
	private static String m1(){
		List<String> countries = Arrays.asList("Austrailia","India","USA","Pakistan","China","Rasia","England","Geromny");
		countries.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		return "";
	}
	private static int m2(){
		List<String> countries = Arrays.asList("Austrailia","India","USA","Pakistan","China","Rasia","England","Geromny");
		countries.stream().map(String::length).forEach(System.out::println); 
		return 4;
		
	}

}
