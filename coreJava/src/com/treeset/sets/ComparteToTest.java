package com.treeset.sets;

public class ComparteToTest {
	public static void main(String args[]){
		System.out.println("A".compareTo("Z")); //-ive
		System.out.println("Z".compareTo("K")); //+ive
		System.out.println("A".compareTo("A")); // 0
		//System.out.println("A".compareTo(null)); //RE: NPE
	}

}
