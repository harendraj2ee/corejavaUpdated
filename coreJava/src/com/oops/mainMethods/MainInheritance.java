package com.oops.mainMethods;

import com.oops.inheritances.Manager;

public class MainInheritance {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setId(1L);
		manager.setFirstName("Sahil");
		manager.setLastName("Sachdeva");
		System.out.println("Manager >> "+manager);
		
	}

}
