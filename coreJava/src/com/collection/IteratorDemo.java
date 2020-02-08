
package com.collection;
import java.util.*;
public class IteratorDemo 
{
    private static final String RAWTYPES = "rawtypes";

	@SuppressWarnings({ "unchecked", RAWTYPES })
	public static void main(String[] args) 
    {
        ArrayList l=new ArrayList();
        for(int i=0; i<=10; i++)
        {
            l.add(i);
            
        }
        System.out.println(l);  //[0,1,2,...10]
        @SuppressWarnings(RAWTYPES)
		Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            Integer I=(Integer)itr.next();
            if(I%2==0)
                System.out.println(I);   //0 2 4 6 8 10
            else
                itr.remove();
        }
        System.out.println(l);      //[0,2,4,6,8,10]
    }
    
}
