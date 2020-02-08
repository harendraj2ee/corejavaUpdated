package com.array.basic;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String args[]) {
		arr();

		revsArrayInt();
		revString();
		stringBufferRevs();
		revs();

	}	
	public static void arr() {
		int a[]= {2,4,6,8,50,20,3,7};
		for (int i : a) {
			System.out.print(i+" ");
		}
		Arrays.sort(a);
		System.out.println("Primitive Array After sorting : ");
		for(int a1:a){
			System.out.print(a1 +" ");
		}
	}
	public static void revsArrayInt() {
		int a[]= {10,20,30,40,51};
		int len=a.length;
		System.out.println(" ");

		for(int i=len-1;i>=1; i--) {
			System.out.println(a[i]);
		}
	}
	public static void revString() {
		String s="Harendra Kumar Sah Delhi";
		String str="";
		int len=s.length();
		for(int i=0; i<len; i++) {
			char ch=s.charAt(i);
			str=ch+str;
		}
		System.out.println(str);
	}
	public static void stringBufferRevs() {
		String s="I Love You INDIA";
		StringBuffer s2= new StringBuffer(s);
		s2.reverse();
		System.out.println("rev >> "+s2);
	}
	
	
	public static void revs() {
		int array[]= {10,20,30,40,50,60};
		int len =array.length;
		for(int i=0; i<len/2; i++)
		{ 
			int temp = array[i]; 
			System.out.println("temp "+temp);
			array[i] = array[len -i -1]; 
			array[len -i -1] = temp; 
			System.out.println(array[i]);
			}
	}

}
