/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import common_package.IntegerArray;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author piya
 */
public class SelectionSort {
    
    /**
     * Sort array using selection sort
     * 
     * @param intArray unsorted array input from user
     * @return sorted array using selection sort
     */
    public static int[] selectionSort(int[] intArray) {
        int minIndex, temp;
        for (int i = 0; i <= intArray.length-2; i++) {
            minIndex = i;
            for (int j = i + 1; j <= intArray.length-1; j++) {
                if(intArray[j]<intArray[minIndex]){
                    minIndex = j;
                }
            }
            temp = intArray[i];
            intArray[i] = intArray[minIndex];
            intArray[minIndex] = temp;
            System.out.println("i: " + i + " Array: " + Arrays.toString(intArray));
        }
        System.out.println("Sorted array: " + Arrays.toString(intArray));
        return intArray;
    }
    
    public static void main(String[] args) {
        selectionSort(IntegerArray.getArray(6));
    }
}
