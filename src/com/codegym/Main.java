package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Input number X to remove");
        int X = input.nextInt();
        int indexToDel = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                indexToDel = i;
                break;
            }
        }
//        for (int j = indexToDel; j < array.length - 1; j++) {
//            array[j] = array[j + 1];
//        }
        System.arraycopy(array, indexToDel + 1, array, indexToDel, array.length - 1 - indexToDel);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
