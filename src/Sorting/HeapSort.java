/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import common_package.IntegerArray;
import java.util.Arrays;

/**
 * A class that implements heapSort algorithm using heap in form of array.
 * 
 * @author piya
 */
public class HeapSort {

    public int[] heapSort(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (j > 0) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            System.out.println("Array after swap: " + Arrays.toString(arr));
            fixHeap(arr, j);
            System.out.println("");
            System.out.println("Array after fix: " + Arrays.toString(arr));
        }
        return arr;
    }

    public int[] fixHeap(int[] arr, int limit) {
        // if a child > parent, swap child and parent
        int i = 0;
        int parentIndex = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;
        int temp = 0;
        int childIndex = 0;
        while (limit >= 0) {
            if (leftIndex <= limit && rightIndex <= limit) {
                System.out.println("Decide childToBeSwapped");
                childIndex = (arr[leftIndex] > arr[rightIndex]) ? leftIndex : rightIndex;
            } else if (rightIndex > limit && leftIndex <= limit) {
                System.out.println("leftIndex");
                childIndex = leftIndex;
            } else if (rightIndex > limit && leftIndex > limit) {
                System.out.println("break");
                break;
            }
            System.out.println("Parent: " + arr[parentIndex] + " Left Child: " + arr[leftIndex] + " Right Child: " + arr[rightIndex]);
            System.out.println("childToBeSwapped: " + arr[childIndex]);

            if (arr[childIndex] > arr[parentIndex]) {
                System.out.println("Swapping..");
                temp = arr[parentIndex];
                arr[parentIndex] = arr[childIndex];
                arr[childIndex] = temp;
            }
            System.out.println("Intermediate swap result: " + Arrays.toString(arr));
            i++;
            parentIndex = i;
            leftIndex = 2 * i + 1;
            rightIndex = 2 * i + 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        HeapSort sort = new HeapSort();
        int[] result = sort.heapSort(IntegerArray.getArray(7));
        System.out.println("Sorted array: " + Arrays.toString(result));
    }
}
