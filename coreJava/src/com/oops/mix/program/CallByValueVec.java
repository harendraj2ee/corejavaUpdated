package com.oops.mix.program;

import java.util.Vector;

public class CallByValueVec {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		v.add(5);
		v.add("Harendra");
		v.add("JaiHind");
		
		callByValue(v);
		
		v.add("Kechu");
		System.out.println("print msg >> "+v);
		
	}
	public static void callByValue(Vector<Object> string) {
		string=null;
	}

}
