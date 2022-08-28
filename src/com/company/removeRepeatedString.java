package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class removeRepeatedString {
 static    void String(char str[], int n){

        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        // HashSet doesn't allow repetition of elements
        for (char x : str)
            s.add(x);

        // Print content of the set
        for (char x : s)
            System.out.print(x);
    }

    public static void main(String[] args) {

        System.out.println("Enter string character");
        Scanner sc = new Scanner(System.in);
        char str[] = sc.next().toCharArray();
        System.out.println("Repeated sting removed");
        int n = str.length;
        String(str, n);

    }
}
