package com.interv2;

public class AbstractMain {

	public static void main(String[] args) {
		TimesTwo tt = new TimesTwo();
		TimesWhat tw = new TimesWhat(5);
		System.out.println("tw : "+tw.multiplyBy);
		System.out.println("tt : "+tt.mutiply(20));
		
	}

}

abstract class Product { 
    int multiplyBy;
    public Product( int multiplyBy ) {
        this.multiplyBy = multiplyBy;
    }

    public int mutiply(int val) {
       return multiplyBy * val;
    }
}

class TimesTwo extends Product {
    public TimesTwo() {
        super(2);
    }
}

class TimesWhat extends Product {
    public TimesWhat(int what) {
        super(what);
    }
}
