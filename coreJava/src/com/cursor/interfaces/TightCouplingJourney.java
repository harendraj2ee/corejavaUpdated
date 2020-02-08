package com.cursor.interfaces;

 class Journey {
    Car1 car = new Car1();
    public void startJourney() {
          car.travel();
    }
}

 class Car1 {
    public void travel () {
         System.out.println("Travel by Car");
    }
}

public class TightCouplingJourney {
	public static void main(String[] args) {
		TightCouplingJourney k = new TightCouplingJourney();
			Journey j = new Journey();
			j.startJourney();
	}

}
