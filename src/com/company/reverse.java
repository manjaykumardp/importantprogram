package com.company;

public class reverse {
    public static void main(String[] args) {
        String name = "manjay";
        int len = name.length();
        String rev = "";
        for(int i=0;i<len;i++){
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
