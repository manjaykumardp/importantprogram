package com.company;

import java.util.Scanner;

public class smallestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reminder , small = num % 10;
        while (num > 0) {
            reminder = num % 10;

            if (small > reminder) {
                small = reminder;
            }
            num = num / 10;

        }
        System.out.println(small);
        sc.close();
    }
}