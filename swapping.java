package com.mycompany.problemssolving;

import java.util.Scanner;


    public class drinkValidity {
  

    public static void main(String[] args)
{
    
        int [] array1 ={1,22,13,4,5,64,89};
        int [] array2 ={34,5,78,3,12,67,89,2};
        
        for(int i=0;i<array1.length;i++){
        
            for(int j=0;j<array2.length;j++){
                
               if(array1[i] == array2[j]){
                   
                   array1=array2;
                   
               }
            }
      
           }
        int array3[] = new int[10];
        for(int i=0;i<array1.length;i++){
            
            array3[i]=array1[i];
        }
         for(int i=0;i<array1.length;i++){
            
            array1[i]=array2[i];
        } for(int i=0;i<array1.length;i++){
            
            array2[i]=array3[i];
        }
         for(int i=0;i<array1.length;i++){
          
            System.out.print(array3[i]);
        }
       
        }
    }
       
 


