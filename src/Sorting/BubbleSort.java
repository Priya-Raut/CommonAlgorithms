/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author piya
 */
public class BubbleSort {
    
    /**
     * Accept an integer array input from user
     *
     * @return anArray input from user
     */
    public static int[] getIntegerArray(int size) {
        int[] anArray = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements: ");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(anArray));
        return anArray;
    }
    
    /**
     * Sort an array using bubble sort
     * 
     * @param intArray unsorted integer array
     * @return sorted integer array
     */
    public static int[] bubbleSort(int[] intArray){
        int temp;
        for(int i=0; i<=intArray.length-2; i++){
            System.out.println("i= " + i + " Array: " +Arrays.toString(intArray));
            for(int j=0; j<=intArray.length-2-i; j++){
                if(intArray[j] > intArray[j+1]){
                    temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
                System.out.println("j= " + j + " Array: " +Arrays.toString(intArray));
            }
        }
        return intArray;
    }
    
    public static void main(String[] args) {
        System.out.println("Sorted Array: " + Arrays.toString(bubbleSort(getIntegerArray(5))));
    }
}
