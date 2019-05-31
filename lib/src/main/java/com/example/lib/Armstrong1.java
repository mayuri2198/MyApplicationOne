package com.example.lib;

import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        int num,temp,rn,sum=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        num=scanner.nextInt();
        temp=num;
        do {
            rn=temp%10;
            sum=sum+(rn*rn*rn);
            temp=temp/10;
        }while (temp>0);
        if(num==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }

    }
}
