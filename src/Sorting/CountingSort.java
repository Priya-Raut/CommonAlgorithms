/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import common_package.IntegerArray;
import java.util.Arrays;

/**
 *
 * @author piya
 */
public class CountingSort {
    
    /**
     * Sort an array using counting sort algorithm.
     * 
     * @param arr unsorted array elements ranging from 0 to 9
     * @return sorted array elements
     */
    public int[] sort(int[] arr) {
        int[] temp = new int[10];
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        System.out.println("Temp array: " + Arrays.toString(temp));
        int k = 0; //pointer for result array
        for (int i = 0; i < temp.length; i++) { // pointer for temp array
            for (int j = 0; j < temp[i]; j++) {
                result[k++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] inputArray = IntegerArray.getArray(12);
        int[] result = countingSort.sort(inputArray);
        System.out.println("Array after sorting: " + Arrays.toString(result));
    }
}
