package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class findLargestN<num> {
        public static void main(String[] args) {
            System.out.println("Take input");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int reminder , larg=0;
            while(num>0){
                 reminder = num%10;
                 if(larg<reminder){
                     larg=reminder;
                 }
                num = num/10;
            }
            System.out.println(larg);
            sc.close();;
        }
}