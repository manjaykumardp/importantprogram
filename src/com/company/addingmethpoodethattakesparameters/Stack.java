package com.company.addingmethpoodethattakesparameters;
class Stack {
    public static void main(String[] args) {
        Stack ss = new Stack();
      ss.Pop();
      ss.push(19);

    }
    int stck[] = new int[10];
    int tos;
    Stack(){
        tos = -1;
    }
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }
        int Pop(){
            if(tos<0){
                System.out.println("Stack overflow");
                return 0;
            }else{
                return stck[tos--];

            }
        }

    }

