package Array.java.com;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfArray {
   static int arr[] = new int[]{1,2,3,4};

   static int sum(){
           int sum = 0;
        for(int i=0;i< arr.length;i++){
             sum = sum + arr[i];


        }
        return sum;

    }

    public static void main(String[] args) {

        System.out.println("Sum of Array is "+ sum());

    }


}
