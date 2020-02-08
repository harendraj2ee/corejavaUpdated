package com.collection.harendra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo {
	public static void main(String[] args) {
		collectionSort();
		binarySearchCollectionSort();
	}

	public static void collectionSort(){
		//Default sorting
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("K");
		al.add("N");
		//al.add(new Interger(10));//RE:CCE
		//al.add(null); //RE:NPE
		System.out.println("Before Sorting al >> "+al);		
		Collections.sort(al);
		System.out.println("After Sorting al >> "+al);
		
		//Customising sort Comparator
		ArrayList al2 = new ArrayList();
		al2.add("Z");
		al2.add("A");
		al2.add("K");
		al2.add("N");
		System.out.println("Before Sorting al Comparator >> "+al2);		
		Collections.sort(al2, new MyComparatorCollectionsSort());
		System.out.println("After Sorting al Comparator >> "+al2);
	}
	//BinarySearch
	public static void binarySearchCollectionSort(){
		//Default sorting
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println("BinarySearch Before Sorting al >> "+al);		
		Collections.sort(al);
		System.out.println("BinarySearch After Sorting al >> "+al);
		System.out.println("Binary Search Z >> "+Collections.binarySearch(al, "Z"));
		System.out.println("Binary Search  J >> "+Collections.binarySearch(al, "J"));

		//Custom sorting
		ArrayList al2 = new ArrayList();
		al2.add(15);
		al2.add(0);
		al2.add(20);
		al2.add(10);
		al2.add(5); 
		System.out.println("BinarySearch Before Sorting al2 >> "+al2);		
		Collections.sort(al2, new MyComparatorBinarySearch());
		System.out.println("BinarySearch Custom After Sorting al2 >> "+al2);
		System.out.println("Binary Search Custom 10  al2 >> "+Collections.binarySearch(al2, 10, new MyComparatorBinarySearch() ));
		System.out.println("Binary Search Custom 13  al2 >> "+Collections.binarySearch(al2, 13, new MyComparatorBinarySearch()));
		System.out.println("Binary Search Custom 17  al2 >> "+Collections.binarySearch(al2, 17));// Unpredictable

		
		//Default sorting
		ArrayList al3 = new ArrayList();
		al3.add(15);
		al3.add(0);
		al3.add(20);
		al3.add(10);
		al3.add(5); 
		System.out.println("BinarySearch Before Sorting al3 >> "+al3);	//[15, 0, 20, 10, 5]	
		Collections.reverse(al3);
		System.out.println("BinarySearch Default Reverse After Sorting al3 >> "+al3);//[5, 10, 20, 0, 15]
		
	
	
	}
}

class MyComparatorCollectionsSort implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
class MyComparatorBinarySearch implements Comparator{
	public int compare(Object obj1,Object obj2){
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		return i2.compareTo(i1);
	}
}
