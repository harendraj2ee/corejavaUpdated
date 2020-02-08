package com.interv2.exception;
public class Foo 
{  
    public static void main(String[] args) 
    {
        try 
        { 
            return; 
        } 
        finally 
        {
            System.out.println( "Finally" ); 
        } 
    } 
}

//Finally