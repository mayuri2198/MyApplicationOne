package com.example.lib;
class Masti {
    public Masti() {
        System.out.println("ABC");
    }

    void hawa() {
        System.out.println("Method is in frame");
    }
}
public class Demo1 extends Masti
{
    public static void main(String[] args)
    {
        System.out.println("Its a good  to see");
        Demo1  m=new Demo1();
       m.hawa();
    }
}
