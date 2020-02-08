package com.scjp.oops;

import java.util.Scanner;

public class Client {
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		int revNum=0;
		System.out.println("Please enter the number is :: ");
		while(num>0){
			
			int rem=0;
			rem=num%10;
			//revNum=(revNum*10)+rem;
			revNum=revNum+rem;
			num=num/10;
		}
		System.out.println(revNum);
	}
}
