package com.oops.abstractions;

import com.oops.abstracts.Animal;

 class Cat extends Animal {
	public void soundOfAnimal() {
		System.out.println("Cat Sound is Meoh.");
	}
	
}
class Dog extends Animal{
	public void soundOfAnimal() {
		System.out.println("Dog sound is Bow Bow");
	}
}
public class AnimalMain{
	public static void main(String args[]) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Animal animal = cat;
		Animal animal2 = dog;
		animal.soundOfAnimal();
		animal2.soundOfAnimal();
	}
}