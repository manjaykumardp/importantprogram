package com.company;

import java.util.Scanner;

public class newp {
    public static void main(String[] args) {

        newp n = new newp();
        n.newps(10,5,10);

    }

    void newps(int x,int y,int z){


        if((x>y)&&(x<=z)){
            x=x+1;
            System.out.println(x);

        }else
            z=z+1;
        System.out.println(z);;
    }
}
