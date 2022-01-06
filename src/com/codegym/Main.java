package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {5,2,6,5,2,3,5,8,23};
//        int index = minValue(arr);
//        System.out.println("The smallest element in the array is: " + arr[index]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at position : " + i);
            array[i] = sc.nextInt();
        }
        int min = minValue(array);
        System.out.println(min);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
