package com.interv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
//1. How to find 1st NonDublicate Character in String
public class Logical {

	public static void main(String[] args) {
		String str ="My Name is Harendra Kumar Sah Mahan hai"; //find the 1st Non Dublicate character in Setence
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		for(int index=0; index<str.length(); index++) {
			char letter = str.charAt(index);
			if (repeating.contains(letter)) {
				continue;
			}
			if(nonRepeating.contains(letter)) {
				nonRepeating.remove((Character)letter);
				repeating.add(letter);
			}
			else {
				nonRepeating.add(letter);
			}
		}
		System.out.println("NonDublicate 1st Char : "+nonRepeating.get(0));
	}
}

//2. How to find non jumping number in given
class Jumping{
	public static void main(String args[]) {
		long num1 = 989898989;
		long num2 = 98987865;
		Map<String , Integer> map = new HashMap();
		map.put("", 2);
		map.put("",3);
		System.out.println("map : "+map);
	}
}

class DublicateOnlyPrint{
	public static void main(String args[]) {
		int array[]= {3,1,4,6,20,100,80,90,10,20,30,50,50,30};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<array.length; i++) {
			if(set.add(array[i])==false)
				System.out.println(array[i]);
		}
	}
}

class DublicateRemove{
	public static void main(String args[]) {
		int array[]= {2,3,4,52,100,3,4,5,60,60,60,50};
		Set<Integer> set = new HashSet<Integer>();
		for(Integer integer:array) {
			if(set.add(integer))
				System.out.println(integer);
		}
		System.out.println("-------------OR-----------same below----");
		int array1[]= {2,3,4,52,100,3,4,5,60,60,60,50};
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i=0; i<array1.length; i++) {
			if(set1.add(array1[i]))
				System.out.println(array1[i]);
		}
	}
}






















