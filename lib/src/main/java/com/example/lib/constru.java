package com.example.lib;

class Box1
{
    double width;
    double height;
    double depth;

    Box1(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

    double volume()
    {
        return width*height*depth;
    }
}
public class constru {
    public static void main(String[] args) {
        Box b=new Box(10,2,5);
        double v=b.volume();
        System.out.println("Volume="+v);
    }
}
