package com.core.java;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class A{
int rs=100;
private String addres="Delhi";
}


public class Test extends A {
	int roll=33;
	String name="Harendra";
	public static void main(String args[]){
		Test t=new Test();
		System.out.println(t.rs);
		System.out.println(t.roll +"   "+t.name);
		ListClass.listMethod();
	}

}
class ListClass{
	public static void listMethod(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vikas");
		list.add("Pooja");
		list.add("Yogesh");
		list.add("Suchitra");
		list.add("Amit");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse order >> "+list);

		Collections.shuffle(list);
		System.out.println("list shuffle >>> "+list);
	}
}
