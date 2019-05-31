package com.example.lib;

class Box
{
    double width;
    double height;
    double depth;

    Box( double w,double h,double d)
    {
        width=w;
        height=h ;
        depth=d;
    }

    double volume()
    {
        return width*height*depth;
    }
}
public class BoxDome {
    public static void main(String[] args) {
        Box myfirstbox=new Box(5,10,15);
        Box mysecondbox=new Box(1,5,7);
        double vol;

        vol=myfirstbox.volume();
        System.out.println("Volume is "+vol);
        vol=mysecondbox.volume();
        System.out.println("Volume is "+vol);

    }
}
