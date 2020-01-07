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
public class SelectionSort {

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
        selectionSort(getIntegerArray(6));
    }
}
