
package com.collection;

import java.util.*;
public class HashSetDemo 
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
    {
        HashSet h=new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));   // false
        System.out.println(h);
        
    }
    
}
