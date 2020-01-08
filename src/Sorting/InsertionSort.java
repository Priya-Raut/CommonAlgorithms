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
public class InsertionSort {

    /**
     * Sort an array using selection sort.
     * 
     * @param anArray unsorted array input from user
     * @return sorted array 
     */
    public static int[] InsertionSort(int[] anArray) {
        int current, j;
        for (int i = 1; i < anArray.length; i++) {
            current = anArray[i];
            j = i - 1;
            while (j>=0 && current < anArray[j]) {
                anArray[j + 1] = anArray[j];
                j--;
            }
            anArray[j+1] = current;
        }
        System.out.println("Sorted array: " + Arrays.toString(anArray));

        return anArray;
    }

    public static void main(String[] args) {
        InsertionSort(IntegerArray.getArray(6));
    }
}
