/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import common_package.IntegerArray;
import java.util.Scanner;

/**
 * Class with a function to find element in ordered array (binary search).
 *
 * @author piya
 */
public class SearchInOrderedArray {

    public static int getMidIndex(int start, int end) {
        return Math.floorDiv(start + end, 2);
    }

    public static int search(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int midIndex = 0;
        while (start >= 0 && end <= arr.length - 1) {
            midIndex = getMidIndex(start, end);
            System.out.println("start: " + start + " mid: " + midIndex + " end:" + end);
            if (num == arr[midIndex]) {
                return midIndex;
            } else if (num > arr[midIndex]) {//find in 2nd half of arr, excluding midIndex
                start = midIndex + 1;
                end = arr.length - 1;
            } else {//find in 1st half
                start = 0;
                end = midIndex;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be searched: ");
        int num = sc.nextInt();
        int Index = search(IntegerArray.getArray(6), num);
        System.out.println("Index: " + Index);
    }
}
