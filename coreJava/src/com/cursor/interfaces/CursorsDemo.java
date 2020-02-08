package com.cursor.interfaces;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class CursorsDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		Enumeration e=v.elements();
		Iterator itr=(Iterator) v.iterator();
		ListIterator litr=v.listIterator();
		System.out.println("$ before outer class after $ 1 is anoymous class :: "+e.getClass().getName());
		System.out.println("$ before outer class after $ inner class ::"+itr.getClass().getName());
		System.out.println("$ before outer class after $ inner class ::"+litr.getClass().getName());
	
	}

}
