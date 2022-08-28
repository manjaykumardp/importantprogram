package com.company.addingmethpoodethattakesparameters;

 class box {
  double hieght;
  double width;
  double depth;
  double volume(){
   return hieght*width*depth;
  }
  void setDim(double w,double h,double d){
   width = w;
   hieght = h;
   depth = d;
  }
}
class boxdemo{
 public static void main(String[] args) {
  box mybox1 = new box();
  box mybox2 =new box();
 double vol;
  mybox1.setDim(10,20,30);
  mybox2.setDim(12,45,30);
  vol = mybox1.volume();
  System.out.println("volume of box1 "+vol);
  vol = mybox2.volume();
  System.out.println("volume of box2 "+vol);
 }

}
