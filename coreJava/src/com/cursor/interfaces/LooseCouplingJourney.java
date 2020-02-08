package com.cursor.interfaces;

 interface Vehicle{
	 void start();
}
 class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Travel by Car....");
	}
}
 class Bike implements Vehicle{
	@Override
	public void start() {
		System.out.println("Travel by Bike.....");
	}
}

public class LooseCouplingJourney {
	public static void main(String args[]) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		car.start();
		bike.start();
	}

}
