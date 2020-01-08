/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common_package;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author piya
 */
public class IntegerArray {
    /**
     * Accept an integer array input from user
     *
     * @param size of array elements
     * @return anArray input from user
     */
    public static int[] getArray(int size) {
        int[] anArray = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements: ");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(anArray));
        return anArray;
    }
}
