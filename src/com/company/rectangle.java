package com.company;;;;;;;;;;;;;;;;;;;;;;;;

class rectangle {;
    double width;
    double hieght;
    double depth;
    double volume(){
        return width * hieght * depth;
    }
}
class boxDmo{;
    public static void main(String[] args) {
        rectangle mybox1 = new rectangle();
        rectangle mybox2 = new rectangle();

        double vol;
        mybox1.depth=10;
        mybox1.width=20;
        mybox1.hieght=15;
        mybox2.depth=10;
        mybox2.width=25;
        mybox2.hieght=15;

    vol =  mybox1.volume();;;;;;;
        System.out.println(vol);

      vol = mybox2.volume();
        System.out.println(vol);
    }


    }

