package com.collection.harendra;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCompartor {
	public static void main(String args[]){
		compartorCustomSort();
		comparableDefaulfSort();
		compartorCustomSortString();
		comparableDefaultSortString();
		compartorCustomSortStringBuffer();
		compartorCustomSortStringBufferString();
	} 
	
	public static void comparableDefaulfSort(){
		TreeSet t=new TreeSet();//---> 2 comparable Default sorting
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println("Comparable Default sorting Ascending >>> "+t);
	}
	// 1:- WAP to insert integer object into the TreeSet where the sorting order is descending order ?

	public static void compartorCustomSort(){
		////TreeSet t=new TreeSet();
		TreeSet t=new TreeSet(new MyComparatorInt());//---> 1 compartor customised sorting
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println("Comparator Customised Sorting Desceding >>> "+t);
	}
	public static void comparableDefaultSortString(){
		TreeSet t = new TreeSet(); 
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("RamuLamma");
		System.out.println("comparable String default ascending order : "+t);

	}
	public static void compartorCustomSortString(){
		TreeSet t = new TreeSet(new MyComparatorString()); 
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("RamuLamma");
		System.out.println("Comparator Custom String  Descending order : "+t);

	}
	
	//StringBuffer only compartor interface working
	public static void compartorCustomSortStringBuffer(){
		TreeSet t = new TreeSet(new MyComparatorStringBuffer()); 
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		System.out.println("compartorCustomSortStringBuffer  Descending order : "+t);
	}
	//StringBuffer And String only compartor interface working
	public static void compartorCustomSortStringBufferString(){
		TreeSet t = new TreeSet(new MyComparatorStringBufferString()); 
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println("compartorCustomSortStringBufferString  Descending order : "+t);
	}	

	
}
class MyComparatorInt implements Comparator
{
	public int compare(Object obj1, Object obj2){
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		//return I1.compareTo(I2);
		//return -I1.compareTo(I2);
		//return I2.compareTo(I1);
		//return -I2.compareTo(I1);
		//return +1;
		//return -1;
		//return 0;
		if (I1 < I2 ) {
			return +1;
		}
		else if (I1 > I2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

//2 :- WAP to insert string object into the TreeSet where all element should be inserted according to reverse of alphbetical order. ?
class MyComparatorString implements Comparator
{
	public int compare(Object obj1, Object obj2){
		String s1 = (String) obj1; //Only string type cast
		String s2 = obj2.toString(); // string or StringBuffer etc.
		return s2.compareTo(s1);
		//return -s1.compareTo(s2);
	}
}
// 3 :- WAP to insert StringBuffer Object into the TreeSet where sorting order is alphabetical order ?
class MyComparatorStringBuffer implements Comparator
{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString(); 
		String s2 = obj2.toString(); // string or StringBuffer etc.
		return s1.compareTo(s2); //ascending
		//return -s1.compareTo(s2);//descending
		//return s2.compareTo(s1); //descending
	}
}
// 4 :- WAP to insert String and StringBuffer object into TreeSet where sorting order is increasing length order. 
//if two object having same length then consider there  alphabetical order.?
class MyComparatorStringBufferString implements Comparator
{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString(); 
		String s2 = obj2.toString(); // string or StringBuffer etc.
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 < len2)
			return -1;
		else if(len1 > len2)
			return 1;
		else 
			return s1.compareTo(s2); //ascending
		//return 0;
		//return -s1.compareTo(s2);//descending
		//return s2.compareTo(s1); //descending
	}
}