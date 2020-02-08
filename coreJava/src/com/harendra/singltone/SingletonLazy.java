package com.harendra.singltone;

public class SingletonLazy {
	private static volatile SingletonLazy instance =null;
	private SingletonLazy() {
		
	}
	public static SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}

}
