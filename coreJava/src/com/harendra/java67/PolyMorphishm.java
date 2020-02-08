package com.harendra.java67;

import java.util.ArrayList;
import java.util.List;

abstract class Pet{
	public abstract void makeSound();
}
class Cat extends Pet{
	public void makeSound() {
		System.out.println("Meow ....");
	}
}
class Dog extends Pet{
	public void makeSound() {
		System.out.println("Woof..");
	}
}

public class PolyMorphishm {
	public static void main(String args[]) {
		List<Pet> pets = new ArrayList<Pet>();
		pets.add(new Cat());
		pets.add(new Dog());
		for (Pet pet : pets) {
			pet.makeSound();
		}
	}

}
