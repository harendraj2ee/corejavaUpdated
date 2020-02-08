package com.interv2;

import java.util.ArrayList;
import java.util.List;

public class MainArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		list.add("Ram");
		list.add("Sita");
		list.add("Geeta");
		list.add("Mohan");
		System.out.println("List :: "+list);
		for(String s:list)
		{
			System.out.println(s);
		}
		
		list2.add(5);
		list2.add(2);
		list2.add(5);
		list2.add(24);
		list2.add(20);
		list2.add(52);
		System.out.println("List2 :: "+list2);
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		

	}

}
