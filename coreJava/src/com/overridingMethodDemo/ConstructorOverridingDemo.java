/*
 Write a program Constructor Overriding method 
 */
package com.overridingMethodDemo;
class ConstrOverriding
{
    public  ConstrOverriding()
    {
        System.out.println("1st Constructor Overriding method");
    }
}
class ConstrOverriding1 extends ConstrOverriding
{
    public  ConstrOverriding1()
    {
        System.out.println("Welcom to 2nd Constructor Overriding method is "); 
    }   
}
class ConstrOverriding2 extends ConstrOverriding1
{
    public  ConstrOverriding2()
    {
        System.out.println("Hello to 3nd Constructor Overriding method JAVA "); 
    }   
}

public class ConstructorOverridingDemo {
    public static void main(String[] args) {
        ConstrOverriding obj = new ConstrOverriding();
        //obj.ConstrOverriding();
        
        ConstrOverriding1 obj1=new ConstrOverriding1();
       // obj1.ConstrOverriding1();
        
        ConstrOverriding2 obj2=new ConstrOverriding2();
        //obj2.ConstrOverriding2();
    }
    
}
