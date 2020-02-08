
package com.collection;
import java.util.*;
public class ArrayListDemo
{
    @SuppressWarnings("unchecked")
	public static void main(String[] args)
    {
        @SuppressWarnings("rawtypes")
		ArrayList l=new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2,"M");
        l.add("N");
        System.out.println(l);
    }
    
}
