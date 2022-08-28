package com.company.addingmethpoodethattakesparameters;

import java.util.Scanner;

public class animal {
    void eat(){
        System.out.println("i am eating");

    }
    void runing(){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        //int fast = 0,slow=0;
        if(speed>100){
            System.out.println("fast");;
        }else{
            System.out.println("slow");;
        }
    }

}
class dog extends animal{

    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        System.out.println("Enter the running speed");
        d.runing();

    }
}
