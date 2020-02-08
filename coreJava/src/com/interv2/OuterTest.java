package com.interv2;

public class OuterTest {

	public static void main(String args[]) 
		{
		nestedLoop();
		System.out.println("\n----------------------------");
		outer: 	    
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 3; j >= 0; j--) 
			{
				 if(i == j) continue outer;
				 System.out.println(i + " " + j);
			}
		}
	}
		public static void nestedLoop() {
			
			        int i,j,k;

			        for (i = 0; i < 3; i++) {
			        	System.out.println("i : "+i);

			            for(j=1; j < 4; j++) {
			            	System.out.println("j : "+j);

			                for(k=2; k<5; k++) {
			                	System.out.println("k : "+k);

			                    if((i == j)   && (j==k))

			                        System.out.println("res i :"+i);
			              
			            }
			        }
			    }
			}
	}