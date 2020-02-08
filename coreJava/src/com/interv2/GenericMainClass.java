package com.interv2;

class CustomGenric<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

}

public class GenericMainClass {
	public static void main(String args[]) {
		CustomGenric<Integer> cg = new CustomGenric<Integer>();
		cg.add(5);
		System.out.println(cg.getObj());
	}

}
