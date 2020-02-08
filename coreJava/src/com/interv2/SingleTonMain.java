package com.interv2;

public class SingleTonMain {

	public static void main(String[] args) {
		SingleTon.getSingleTon();
		
	}

}
class SingleTon{
	private static SingleTon instance = null;
	private SingleTon() {
		
	}
	public static SingleTon getSingleTon() {
		if(instance==null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
}
