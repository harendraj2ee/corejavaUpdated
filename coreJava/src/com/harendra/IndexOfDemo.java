/*
 
Java – String indexOf() Method example
 */
package com.harendra;

public class IndexOfDemo {
	public static void main(String[] args) {
		String str1 = new String("This is a BeginnersBook tutorial");
		String str2 = new String("Beginners");
		System.out.println("hascode of str2 ::: "+str2.hashCode());
		String str3 = new String("Book");
		System.out.println("hashcode of str3 ::: "+str3.hashCode());
		String str4 = new String("Books");
		System.out.println("hashcode of str4 ::: "+str4.hashCode());
		System.out.println("Index of B in str1: " + str1.indexOf('B'));
		System.out.println("Index of B in str1 after 15th char:" + str1.indexOf('B', 15));
		System.out.println("Index of B in str1 after 30th char:" + str1.indexOf('B', 30));
		System.out.println("Index of string str2 in str1:" + str1.indexOf(str2));
		System.out.println("Index of str2 after 15th char" + str1.indexOf(str2, 15));
		System.out.println("Index of string str3:" + str1.indexOf(str3));
		System.out.println("Index of string str4" + str1.indexOf(str4));
		System.out.println("Index of harcoded string:" + str1.indexOf("is"));
		System.out.println("Index of hardcoded string after 4th char:" + str1.indexOf("is", 4));

	}

}