package com.scjp.oops;
class Light{
	//Instance fields:  //1
	int noOfWatts;		
	private boolean indicator;
	protected String location;
	private static int counter;// no. of light objects created
	//Constructor :
	Light(){
		noOfWatts=50;
		indicator=true;
		location="X";
		counter++;
	}
	//Instance methods
	public void switchOn(){ indicator=true;}
	public void switchOff(){indicator=false;}
	public boolean isOn(){ return indicator;}
	private void printLocation(){
		System.out.println("Location : "+location);
	}
	//static methods:
	public static void writeCount(){
		System.out.println("Number of lights :"+counter);
	}
	//..............	
}
//------------------------------------------------------------------------
class TubeLight extends Light{  //Subclass uses the extends clause
	//Instance fields:
	private int tubeLength=54;
	private int colorNo=10;
	//Instance method:
	public int getTubeLength(){ return tubeLength;}
	public void printInfo(){
		System.out.println("Tube legth : "+getTubeLength());
		System.out.println("Color number  : "+colorNo);
		System.out.println("Wattage : "+noOfWatts);	//Inherited
		//System.out.println("Indicator : "+indicator);	//not Inherited
		System.out.println("Indicator : "+isOn());	//Inherited
		System.out.println("Location : "+location);	//Inherited
		//printerLocation();			//Not Inherited
		//System.out.println("Counter : "+ counter);  //Not Inherited
		writeCount();	// Inherited
	}
	//........
	
}
public class Utility {	//3
	public static void main(String args[]){
		new TubeLight().printInfo();
	}
}
