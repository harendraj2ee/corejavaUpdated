package com.oops.map.impl;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		hashMap();
		
	}
	private static void hashMap() {
		String s1 = "FB";
		String s2 = "Ea";
		System.out.println("hashcode of s1 and s2 :: "+s1.hashCode() + "  " +s2.hashCode());
		Map<String, Integer> map = new java.util.HashMap<String, Integer>();
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);
		System.out.println("HasMap value >> "+map);
	}

}
