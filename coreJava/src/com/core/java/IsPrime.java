package com.core.java;

public class IsPrime {

	public static void main(String[] args) {
		IsPrime primeObj=new IsPrime();
		System.out.println("2 nubmer is prime or not >>"+primeObj.isPrimeNumber(2));
		System.out.println("7 nubmer is prime or not >>"+primeObj.isPrimeNumber(7));
		System.out.println("9 nubmer is prime or not >>"+primeObj.isPrimeNumber(9));
		System.out.println("11nubmer is prime or not >>"+primeObj.isPrimeNumber(11));
		System.out.println("18 nubmer is prime or not >>"+primeObj.isPrimeNumber(18));
		System.out.println("23 nubmer is prime or not >>"+primeObj.isPrimeNumber(23));
		System.out.println("40 nubmer is prime or not >>"+primeObj.isPrimeNumber(40));


	}
	public boolean isPrimeNumber(int number){
		for(int i=2;i<=number/2; i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	

}
