package data.structure.java;

import java.util.Scanner;

public class linearSearch {
    public static  int search(int[] arr ,int key ){

         for(int i =0;i<arr.length;i++){

             if(arr[i]==key){
                 return i;
             }
         }

        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr1[]= new int[num];
           for(int i=0;i<num;i++){
              arr1[i] = sc.nextInt();
               System.out.print(arr1[i]+" ");
           }
        int key = sc.nextInt();

        System.out.println(search(arr1, key));
    }
}
