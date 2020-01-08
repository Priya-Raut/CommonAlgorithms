/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import common_package.IntegerArray;
import java.util.Scanner;

/**
 *
 * @author piya
 */
public class SearchInUnorderedArray {
    
    /**
     * 
     * @param anArray
     * @param element
     * @return 
     */
    public static int search(int[] anArray, int element){
        System.out.println("Element to be searched: " + element);
        for(int i=0; i< anArray.length; i++){
            if(element == anArray[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be searched: ");
        int element = sc.nextInt();
        int index = search(IntegerArray.getArray(6),element);
        System.out.println("Index is " + index);
    }
}
