package com.greekof.api;

import java.util.Random;

public class GenerateOTP {
	public static char[] optGenerate(int len) {
		System.out.println("Generating Random Value... For OTP Password. ");
		String captial_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_char = "abcdefghijklmnopqurstuvwxyz";
		String number_char = "0123456789";
		String special_char = "!@#$%^&*()_-+=|,<.>/?~";
		String total_values = captial_char + small_char + number_char + special_char;
		Random randome_value = new Random();
		char[] password = new char[len]; 
		for(int i=0; i<len; i++) {
			password[i] = total_values.charAt(randome_value.nextInt(total_values.length()));
		}
		return password;
	}
	public static void main(String[] args) {
		int length =6;
		System.out.println(optGenerate(length));
	}

}
