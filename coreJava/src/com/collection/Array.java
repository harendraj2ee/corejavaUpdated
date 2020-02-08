/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.ArrayList;
import java.util.Collections;


public class Array
{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Google");
        al.add("MicroSoft");
        al.add("Apple");
        al.remove(1);
        System.out.println("Remove is : "+al);
        Collections.sort(al);
        for (Object object : al) {
			System.out.println(al);
		}
    }
    
}
