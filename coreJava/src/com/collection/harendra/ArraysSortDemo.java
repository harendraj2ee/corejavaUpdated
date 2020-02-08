package com.collection.harendra;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
	public static void main(String[] args) {
		arraysSort();
	}

	public static void arraysSort() {
		int[] a = { 10, 5, 20, 11, 6 };
		System.out.println("Primitive Array before sorting :");
		for (int a1 : a) {
			System.out.println(a1);// 10,
		}
		Arrays.sort(a);
		System.out.println("Primitive Array After sorting : ");
		for (int a1 : a) {
			System.out.println(a1);
		}
		String[] s = { "A", "Z", "B" };
		System.out.println("Object Array Before sorting : ");
		for (String a2 : s) {
			System.out.println(a2);
		}
		Arrays.sort(s);
		System.out.println("Object Array After Sorting : ");
		for (String a1 : s) {
			System.out.println(a1);
		}
		Arrays.sort(s, new MyComparatorArraySort());
		System.out.println("Object Array After sorting by comparator : ");
		for (String a1 : s) {
			System.out.println(a1);
		}
	}

	// Not completed... start
	public static void arraysSearch() {
		int[] a = { 10, 5, 20, 11, 6 };
		Arrays.sort(a); // sort by natural order
		System.out.println("BinarySearch search 6 >> " + Arrays.binarySearch(a, 6));
		System.out.println("BinarySearch search  14 >> " + Arrays.binarySearch(a, 14));

		String[] s = { "A", "Z", "B" };
		Arrays.sort(s);
		System.out.println("BinarySearch search Z >> " + Arrays.binarySearch(s, "Z"));
		System.out.println("BinarySearch search  S >> " + Arrays.binarySearch(s, "S"));

	}
	// End
}

class MyComparatorArraySort implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
