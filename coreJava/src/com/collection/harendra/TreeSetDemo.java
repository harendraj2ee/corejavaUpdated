package com.collection.harendra;

import java.util.*;
public class TreeSetDemo {
	public static void main(String args[]){
		TreeSet t=new TreeSet();
		treeset1();
		//treeset2(); not comparable RE:ClassCastException
		comparableMethod1();
		navigationSet();
		navigationMap();
	}
	public static void treeset1(){
		TreeSet t1=new TreeSet();
		//t1.add(null);// 1.7 version onward NPE 
		t1.add("A");
		t1.add("D");
		t1.add("B");
		//t1.add(new Integer(10));//java.lang.ClassCastExcetion.
		//t1.add(null);// 1.7 version onward NPE 
		System.out.println("t1 >> "+t1);
	}
	public static void treeset2(){
		TreeSet t2=new TreeSet<>();
		t2.add(new StringBuffer("A"));
		t2.add(new StringBuffer("Z"));
		t2.add(new StringBuffer("L"));
		t2.add(new StringBuffer("B"));
		System.out.println("t2 >> "+t2);
	}
	public static void comparableMethod1(){
		//comparable   java.lang package
		//coparator java.util package
		System.out.println("1 show >>> "+"A".compareTo("Z"));
		System.out.println("2 show >>> "+"Z".compareTo("A"));
		System.out.println("3 show >>> "+"A".compareTo("A"));
		//System.out.println("4 show >>> "+"A".compareTo(null));//RE:NPE
	}
	
	//Navigation Set
	public static void navigationSet(){
		TreeSet<Integer> t2=new TreeSet<Integer>();
		t2.add(1000);
		t2.add(2000);
		t2.add(3000);
		t2.add(4000);
		t2.add(5000);
		System.out.println("NaviationSet >> "+t2);
		System.out.println("ceiling >> "+t2.ceiling(2000));
		System.out.println("higher >> "+t2.higher(2000));
		System.out.println("floor >> "+t2.floor(3000));
		System.out.println("lower >> "+t2.lower(3000));
		System.out.println("pollFirst >> "+t2.pollFirst());
		System.out.println("pollLast >> "+t2.pollLast());
		System.out.println("descendingSet >> "+t2.descendingSet());
		System.out.println("TreeSet NavigationSet >> "+t2);
	}
	
	//Navigation Map 
		public static void navigationMap(){
			//Default Sort
			TreeMap<String, String> tm = new TreeMap<String,String>();
			tm.put("b", "banana");
			tm.put("c", "cat");
			tm.put("a", "apple");
			tm.put("d", "dog");
			tm.put("g", "gun");

			System.out.println("NaviationMap >> "+tm);
			System.out.println("ceilingKey >> "+tm.ceilingKey("c"));
			System.out.println("higherKey >> "+tm.higherKey("e"));
			System.out.println("floorKey >> "+tm.floorKey("e"));
			System.out.println("lowerKey >> "+tm.lowerKey("e"));
			System.out.println("pollFirstEntry >> "+tm.pollFirstEntry());
			System.out.println("pollLastEntry >> "+tm.pollLastEntry());
			System.out.println("descendingMap>> "+tm.descendingMap());
			System.out.println(" TreeMap Navigation Map >> "+tm);
		
		//Customising sort comparator
			TreeMap<String, String> tm1 = new TreeMap<String,String>(new MyComparatorNavationMap());
			tm1.put("b", "banana");
			tm1.put("c", "cat");
			tm1.put("a", "apple");
			tm1.put("d", "dog");
			tm1.put("g", "gun");

			System.out.println("NaviationMap tm1 >> "+tm1);
			System.out.println("ceilingKey tm1 >> "+tm.ceilingKey("c"));
			System.out.println("higherKey tm1 >> "+tm.higherKey("e"));
			System.out.println("floorKey tm1 >> "+tm.floorKey("e"));
			System.out.println("lowerKey tm1 >> "+tm.lowerKey("e"));
			System.out.println("pollFirstEntry tm1 >> "+tm.pollFirstEntry());
			System.out.println("pollLastEntry >> "+tm.pollLastEntry());
			System.out.println("descendingMap tm1 >> "+tm.descendingMap());
			System.out.println(" TreeMap Navigation Map tm1 >> "+tm1);
		}
}
class MyComparatorNavationMap implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}