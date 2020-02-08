package com.loosecouple.interview;
 interface Vehicle {
    void start();
}
 class Car implements Vehicle {
    @Override
    public void start() {
          System.out.println("Travel by Car");
    }
}

 class Bike implements Vehicle {
     @Override 
     public void start() {
           System.out.println("Travel by Bike");
     }
}
public class LooseCoupingTest {
    // create main class Journey
         public static void main(String[] args) {
               Vehicle v = new Car();
               v.start();
         }
   } 

