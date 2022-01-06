package com.codegym;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,2,6,5,2,3,5,8,23};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
