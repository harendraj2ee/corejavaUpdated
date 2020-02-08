/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;
import java.math.*;
/**
 *
 * @author Home
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        
        int i="Trisect Institute".lastIndexOf('s');
        //System.out.println(i);
        double d=Math.max(1,4);
        double d1=Math.max(2.3, 5);
        //double d2=Math.max(1, 3, 5, 7);
        double d3=Math.max(-1.5, -2.8f);
        int a = Math.abs(-5);	
       // System.out.println(d+" "+d1+" "+d3);
        /*
         * String vs StringBuffer

1) Mutability: String is immutable (Once created, cannot be modified) while StringBuffer is mutable (can be modified).

Example –
String is immutable:

String str = "Hello World";
str = "Hi World!";
By seeing this code you would say that the value of str has changed so how can it be immutable? Let me explain this:
In first statement an object is created using string literal “Hello World�?, in second statement when we assigned the new string literal “Hi World!�? to str, the object itself didn’t change instead a new object got created in memory using string literal “Hi World!�? and the reference to it is assigned to str. So basically both the objects “Hello World�? and “Hi World!�? exists in memory having different references(locations).

StringBuffer is mutable:

Lets see StringBuffer mutability

StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
In the first statement StringBuffer object got created using string literal “Hello�? and in second statement the value of the object got changed to “Hello World�? from “Hello�?. Unlike Strings here the object got modified instead of creating the new object.

2) Performance: While performing concatenations you should prefer StringBuffer over String because it is faster. The reason is: When you concatenate strings using String, you are actually creating new object every time since String is immutable.
         */
        String str = "Hello World";
str = "Hi World!";
        System.out.println(str);
        StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
        System.out.println(sb);
    }
    
}
