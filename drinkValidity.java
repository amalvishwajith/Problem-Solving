package com.mycompany.problemssolving;

import java.util.Scanner;


    public class drinkValidity {
  

    public static void main(String[] args)
{
        int age = 0;
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("Enter age between 18 and 21)");
        
        age = keyboard.nextInt();
            
        switch(age)
     {
        case 21:
            
        System.out.println("You can drink AND vote legally!");
       
        break;
        
        case 20:
        case 19:
        case 18:
        System.out.println("You can vote legally!");
        
        break;
         default:
                
        System.out.println("You cannot drink!");
                
        break;
    }
        System.out.println("program end!");
    }
    
}


