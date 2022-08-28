package com.company;

public class checkAjecent {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0};
        System.out.println(adjecent(arr));
    }
    static boolean adjecent(int[] arr){
        int count =0;
        for(int i=0;i< arr.length;i++){
            count = arr[i];
            if(arr[0]==arr[1]){

                return true;
            }else{
                return false;
            }
        }

        return true;

    }

}
