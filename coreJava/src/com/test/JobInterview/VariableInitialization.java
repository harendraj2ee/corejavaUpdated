package com.test.JobInterview;

import com.test.model.Player;

public class VariableInitialization {
    public static void main(String[] args) {
        Player player = new Player();
        
        //score is an int member variable - default 0
        System.out.println(player.score);//0 - RULE1
        
        //name is a member reference variable - default null
        System.out.println(player.name);//null - RULE1
        
        int local; //not initialized
        //System.out.println(local);//COMPILER ERROR! RULE3

        String value1;//not initialized
        //System.out.println(value1);//COMPILER ERROR! RULE3
        
        String value2 = null;//initialized
        System.out.println(value2);//null - NO PROBLEM.
    }
}