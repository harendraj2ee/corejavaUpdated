package com.array.basic;
public class OntTo50Print {

	public static void main(String[] args) {
		oneTo5oMethod();

	}
	public static void oneTo5oMethod() {
		for(int i=1; i<=50; i++) {
			//	System.out.println(i);
				if(i%3==0) 
					System.out.println("divided by 3 >> "+i);
				else 
					System.out.println("not divided by 3 ?????????????");
				 if(i%5==0) 
					System.out.println("Divided by 5 >> "+i);
				 else
					 System.out.println("Not Divided by 5 =========== ===");
				 if(i%3==0 && i%5==0) 
					System.out.println("Divided by 3 and 5 >>  "+i);
				
				else
					System.out.println("Not divided by 3 and 5 ------------------------");
					
			}
	}

}
