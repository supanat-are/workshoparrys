package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {

        Scanner redder = new Scanner(System.in);

        int[] number;
        number = new int[10];
        String input = "";

        while (!input.equals("Y")) {
            for (int i = 0; i < number.length; i++) {
                System.out.print("number" + (i + 1) + ":");
                int num = redder.nextInt();
                number[i] = num;

            }
            System.out.println("Please enter max of array:" + number.length);
            for (int i = 0; i < number.length; i++) {
                System.out.println("Please enter number" + "[" + i + "]" + ":" + number[i]);
            }
            System.out.println("Print values in array after sorting less than to moer than");
            System.out.print("## Before sorting:");
            for (int i = 0; i < number.length; i++) {
                System.out.print("\t" + number[i]);
            }
            System.out.print("## After sorting:");
            Arrays.sort(number);
            for (int i = 0; i < number.length; i++) {
                System.out.print("\t" + number[i]);
            }



            System.out.println("###################################");
            System.out.println("do you want to exti program Y/N : ");
            input = redder.next();
        }
        System.out.print("Exit program");

    }
}
