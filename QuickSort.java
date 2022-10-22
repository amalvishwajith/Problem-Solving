
package com.mycompany.datastructures;

import java.util.Arrays;
        
        
public class QuickSort {
     
    private int tempArray[];
    private int len;
 
    public void sort(int[] number) {
         
        if (number == null || number.length == 0) {
            return;
        }
        this.tempArray = number;
        len = number.length;
        quickSort(0, len - 1);
    }
     private void quickSort(int lowIndex, int highIndex) {
         
        int i = lowIndex;
        int j = highIndex;
        
        int pivot = tempArray[lowIndex+(highIndex-lowIndex)/2];
        
        while (i <= j) {
               while (tempArray[i] < pivot) {
                i++;
            }
            while (tempArray[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                
                i++;
                j--;
            }
        }
       
        if (lowIndex < j)
            quickSort(lowIndex, j);
        if (i < highIndex)
            quickSort(i, highIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = tempArray[i];
        tempArray[i] = tempArray[j];
        tempArray[j] = temp;
    }
     
    
    public static void main(String args[])
    {
        QuickSort obj = new QuickSort();
        int nums[] = {5, 16, -3, 2, 4, 35, 41};
        System.out.println("Displaying Original Array:");
        System.out.println(Arrays.toString(nums));
        obj.sort(nums);
        System.out.println("Displaying Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
}


