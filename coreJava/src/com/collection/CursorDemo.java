
package com.collection;
import  java.util.*;
public class CursorDemo 
{
    private static final String RAWTYPES = "rawtypes";

	@SuppressWarnings(RAWTYPES)
	public static void main(String[] args) 
    {
		Vector v=new Vector();
        Enumeration e=v.elements();
        Iterator itr=v.iterator();
        ListIterator litr=v.listIterator();
        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(litr.getClass().getName());
        
    }
    
}
