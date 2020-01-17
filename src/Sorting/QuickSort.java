/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import common_package.IntegerArray;
import java.util.Arrays;

/**
 * A class that implements quick sort algorithm.
 *
 * @author piya
 */
public class QuickSort {

    public int[] quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivote = partition(arr, start, end);
            quickSort(arr, start, pivote - 1);
            quickSort(arr, pivote + 1, end);
        }
        return arr;
    }

    public int partition(int[] arr, int start, int end) {
        int pivote = end;
        int i = start;
        int temp = 0;
        for (int j = start; j <= end-1; j++) {
            //move smaller elements than pivote to the start pf array
            if (arr[j] <= arr[pivote]) {
                //swap arr[j] and arr[i]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        //swap pivote and arr[i]
        temp = arr[pivote];
        arr[pivote] = arr[i];
        arr[i] = temp;
        System.out.println("Partitioned array: " + Arrays.toString(arr) + "pivote: " + i);
        return i;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] arr = IntegerArray.getArray(5);
        int[] result = sort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(result));
    }
}
