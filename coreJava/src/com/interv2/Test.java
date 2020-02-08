package com.interv2;

import java.util.HashSet;
import java.util.Set;

//method hiding
class Parent{
	public static void overrid() {
		System.out.println("parent method");
	}
}
class Child extends Parent{
	public static void overrid() {
		System.out.println("Child....");
	}
} // method hiding compile time polmorphism

class Parent2{
	public void overrid2() {
		System.out.println("Parent2 overide2");
	}
}
class Child2 extends Parent2{
	public void overrid2() {
		System.out.println("Child2 override2");
	}
}

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		p.overrid(); //compiletime polymorphism0
		
		Parent2 p2 = new Child2();
		p2.overrid2(); //runtime polymorphism
		
		boolean x=false;
		if(x) {
			System.out.println("xxxx");
		}else {
			System.out.println("jjj");
		}
	}

}

class ArithmeticOper{
	
	static{
	System.out.println("static-1");
}
	public static void main(String args[]) {
		{
			System.out.println("Init block");
		}
		System.out.println("main method");
	}
	static {
		System.out.println("static-2");
	}
	
}



 class shutDownHooksDemo {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            try {
                if(i==4) {
                    System.out.println("Inside Try Block.Exiting without executing Finally block.");
                    System.exit(0);
                }
            }
            finally {
                System.out.println("Inside Finally Block.");
            }
        }
    }
}

 class DublicatArray{
	 public static void main(String args[]) {
		 int a[]= {1,3,5,2,1,3,3};
		 for(int i=0; i<a.length; i++) {
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i]==a[j]) 
					 System.out.println(a[j]);
				 
			 }
		 }
	 }
 }

 
 class DuplicateElement {  
	    public static void main(String[] args) {      
	          
	        //Initialize array   
	        int [] arr ={1, 2, 3, 4, 2, 7, 8, 8, 3};   
	          
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	    }  
	}  




 
//Java program to find the only repeating 
//element in an array where elements are 
//from 1 to n-1. 
 

class GFGg 
{ 

	static int findRepeating(int[] arr, int n) 
	{ 
		// Find array sum and subtract sum 
		// first n-1 natural numbers from it 
		// to find the result. 

		int sum = 0; 
		for (int i = 0; i < n; i++) 
			sum += arr[i]; 
		return sum - (((n - 1) * n) / 2); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		int[] arr = { 9, 8, 2,8, 6,8, 1, 8, 5, 3,3,3,3,3,3, 4, 7 }; 
		int n = arr.length; 
		System.out.println(findRepeating(arr, n)); 
	} 
} 

 class DuplicateInArray 
{
    public static void main(String[] args) 
    {
        int[] array = {1,1,2,3,4,5,6,7,8,8};
         
        Set<Integer> set = new HashSet<Integer>();
         
        for(int i = 0; i < array.length ; i++) 
        {
            //If same integer is already present then add method will return FALSE 
            if(set.add(array[i]) == false) 
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
    }
}

 
 
 
 
 