package com.harendra.java67;

public class DynamicBindingTest {
	public  static void main(String[] args) {
        Vehicle vehicle = new Car(); //here Type is vehicle but object will be Car
		vehicle.start();//Car's start called because start() is overridden method

	}
}
class Vehicle {
	public void start() {
		System.out.println("Inside start method for Vehicle ");
	}
}
class Car extends Vehicle {
	public void start() {
		System.out.println("Inside start method for Car");
	}
}
