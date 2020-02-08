package com.harendra.java67;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class StaticBindingTest {
	public static void main(String args[]) {
		StaticBindingTest sbt = new StaticBindingTest();
		Collection coll = new HashSet();
		sbt.sort(coll);
		
	}
	//Overload method takes collection arguments.
	public Collection sort(Collection c) {
		System.out.println("Inside Collection sort method... ");
		return c;
	}
	//Another overloaded method which takes HashSet argument which is sub class.
	public Collection sort(HashSet hs) {
		System.out.println("Inside HashSet sort method... ");
		return hs;
	}

}
