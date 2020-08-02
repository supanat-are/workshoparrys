package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        String input = "";

        Scanner reader = new Scanner(System.in);
        while (!input.equals("Y")) {

        System.out.println("#####################################");
        System.out.print("Please enter number of max array: ");
        int maxArray = reader.nextInt();
        System.out.println("You enter max of array is " + maxArray);

        int[] numberArray = new int[maxArray];

        for (int i = 0; i < maxArray; i++) {
            System.out.print("Please enter number" + "[" + (i+1) + "]" + ":");
            numberArray[i] = reader.nextInt();
        }
        System.out.println("Print values in array after sorting less than to moer than");

        System.out.print("## Before sorting:");
        for (int i = 0; i < maxArray; i++) {
                System.out.print("\t" + numberArray[i]);
        }


        System.out.println();
        System.out.print("## After sorting: \t");

        // methon
        int n = numberArray.length;
        for (int j = 1; j < n; j++) {
            int key = numberArray[j];
            int i = j-1;
            for (;( i > -1 )&& ( numberArray [i] < key );i-- ) {
                numberArray [i+1] = numberArray [i];
//                i--;
            }
            numberArray[i+1] = key;
        }

        for (int i = 0; i < maxArray; i++) {
            System.out.print(numberArray[i] + "    ");
        }
            System.out.println("\n###################################");
            System.out.print("do you want to exti program Y/N : ");
            input = reader.next();
        }
        System.out.println("Exit program");

    }

}
//        Scanner redder = new Scanner(System.in);
//
//
//        int[] number;
//        number = new int[10];
//        String input = "";
//
//        while (!input.equals("Y")) {
//            for (int i = 0; i < number.length; i++) {
//                System.out.print("number" + (i + 1) + ":");
//                int num = redder.nextInt();
//                number[i] = num;
//
//            }
//            System.out.println("Please enter max of array:" + number.length);
//            for (int i = 0; i < number.length; i++) {
//                System.out.println("Please enter number" + "[" + i + "]" + ":" + number[i]);
//            }
//            System.out.println("Print values in array after sorting less than to moer than");
//            System.out.print("## Before sorting:");
//            for (int i = 0; i < number.length; i++) {
//                System.out.print("\t" + number[i]);
//            }
//            System.out.print("## After sorting:");
//
//            for (int i = 0; i < number.length; i++) {
//                System.out.print("\t" + number[i]);
//            }
//
//
//
//            System.out.println("###################################");
//            System.out.println("do you want to exti program Y/N : ");
//            input = redder.next();
//        }
//        System.out.println("Exit program");
