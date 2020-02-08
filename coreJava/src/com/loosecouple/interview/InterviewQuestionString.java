package com.loosecouple.interview;

class FinalizeDemo {
	protected void finalize() {
		System.out.println("Object is finalized....");
	}
}

public class InterviewQuestionString {
	public static void main(String[] args) {
		int i = 10; // Single valie Container
		Integer iRef = new Integer(i); // Boxed (Constructing the object)
		int j = iRef.intValue();// Unboxing (Extracting the value from Object)
		Integer kRef = i; // AutoBoxing (Integer kRef = new Integer(i); )
		int l = kRef; // AutoBoxing
		System.out.println("lllllll >> " + l);
		FinalizeDemo fdRef = new FinalizeDemo();
		fdRef = null;
		System.gc();
		String str = new String("hello");
		StringBuffer buffer = new StringBuffer("hello");
		StringBuilder builder = new StringBuilder("hello");
		System.out.println("String >> " + str + ",  StringBuffer >> " + buffer + ", StringBuilder >> " + builder);
		str.concat("HIII...");
		// str=str.concat(str.concat("kkk")); //break rule...
		buffer.append("HIII...");
		builder.append("HIII...");
		System.out.println("String >> " + str + ",  StringBuffer >> " + buffer + ", StringBuilder >> " + builder);
		String str1 = new String("data");
		String str2 = new String("data");
		if (str1 == str2) {
			System.out.println("str1 == str2");// comparing reference not condition true..
		} else {
			System.out.println("str1 != str2");// true
		}
		if (str1.equals(str2)) { // comparing value within the Object
			System.out.println("str1.equals(str2)");
		} else {
			System.out.println("str1 not equals str2");
		}

	}

}
