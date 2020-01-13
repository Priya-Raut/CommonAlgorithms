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
public class MergeSort {

    /**
     * Merge individually sorted arrays.
     * 
     * @param arr
     * @param start
     * @param middle
     * @param end
     */
    public void merge(int arr[], int start, int middle, int end) {
        int[] left = new int[middle - start + 1];
        int[] right = new int[end - middle];
        //copy 1st half of the array into temporary left array
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start + i];
        }
        System.out.println("Left array: " + Arrays.toString(left));
        //copy 2nd half of the array into temporary right array
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[middle + 1 + j];
        }
        System.out.println("Right array: " + Arrays.toString(right));
        //sort elements among left and right array and put into origianl array
        int k = start, i = 0, j = 0;
        while (k <= end) {
            if (j >= right.length || left[i] < right[j] && i < left.length) {
//                System.out.println("Incrementing left");
                arr[k] = left[i];
                i++;
            } else {
//                System.out.println("Incrementing right");
                arr[k] = right[j];
                j++;
            }
            k++;
        }

//        System.out.println("Array: " + Arrays.toString(arr));
    }

    /**
     * Sort function which is called recursively to sort an array.
     * 
     * @param arr
     * @param start
     * @param end
     */
    public void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = Math.floorDiv(start + end, 2);
//            System.out.println("Middle: " + middle);
            mergeSort(arr, start, middle); //divide array into first half
            mergeSort(arr, middle + 1, end); //divide array into second half
            merge(arr, start, middle, end);
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = IntegerArray.getArray(4);
        mergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

