

package com.mycompany.problemssolving;

import java.util.Scanner;


public class ProblemsSolving {

    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        int input = 0;
        int max = 0;
        int min = 0;
        
         System.out.println("Enter non zero integer or 0 to exit");
        input = keyboard.nextInt();
        
        max= input;
        min= input;
       
        
        while(input !=0)
        {   
                 System.out.println("Enter non zero integer or 0 to exit");
                 input = keyboard.nextInt();
                if(input>max){
                    max= input;
                    
              }
                if(input<min){
                    min = input;
                }
        }
        System.out.println("maximum is:"+max);
        System.out.println("minimum is:"+min);
        
    }
}
