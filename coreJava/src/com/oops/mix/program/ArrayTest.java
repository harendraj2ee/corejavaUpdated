package com.oops.mix.program;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ArrayTest {
	public static void main(String[] args) {
		int a[]= {};
		System.out.println(a);
		mm(a);
		concurrentHashMap();
	}
	public static void mm(int a[]) {
		int d[]= {1,9,8,4};
		System.out.println(d[3]);
		for(int k:d) {
			System.out.println(k);
		}
	}
	static void concurrentHashMap() {
		Map<String, Integer> map = new ConcurrentHashMap<String,Integer>();
		map.put("Harendra", 1);
		map.put("Software engineer", 2);
		System.out.println(map);
	}

}
