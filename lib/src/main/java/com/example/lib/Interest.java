package com.example.lib;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        float p,r,t=2;
        Scanner s=new Scanner (System.in);
        System.out.println("Enter The Principal");
                p=s.nextFloat();
        System.out.println("Enter The Rate Of Interest");
                r=s.nextFloat();
                float f;
                f=(r*t*p)/100;
        System.out.println("The Simple Interest Is" +f);
    }
}
