/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import common_package.IntegerArray;
import java.util.Arrays;

/**
 * A class that implements shell sort algorithm.
 *
 * @author piya
 */
public class ShellSort {

    public int[] shellSort(int[] arr) {
        int gap = getDistance(arr.length);
        while (gap >= 1) {
            insertSortWithGap(arr, gap);
            gap = (gap - 1) / 3;
        }
        return arr;
    }

    public int[] insertSortWithGap(int[] arr, int gap) {
        int current;
        int k = 0;
        while (k < gap) {
            for (int j = gap + k; j < arr.length; j = j + gap) {
                int i = j - gap;
                current = arr[j];
                while (i >= 0 && current < arr[i]) {
                    arr[i + gap] = arr[i];
                    i = i - gap;
                }
                arr[i + gap] = current;
            }
            k++;
        }
        return arr;
    }

    public int getDistance(int size) {
        int h = 1;
        while (h < size / 3) {
            h = 3 * h + 1;
        }
        return h;
    }

    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        int[] result = sort.shellSort(IntegerArray.getArray(10));
        System.out.println("Sorted array: " + Arrays.toString(result));
    }
}
