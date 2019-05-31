package com.example.lib;

import java.util.Scanner;

public class Fact1 {
    public static void main(String[] args) {
        int n ,c,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number =" );

        n=in.nextInt();
        if(n<0)
        System.out.println("Number Should not be negative");
        else
        {
            for(c=1;c<n;c++)
                fact=fact*c;
            System.out.println("Factorial of"+n+" is="+fact);
        }
    }

}
