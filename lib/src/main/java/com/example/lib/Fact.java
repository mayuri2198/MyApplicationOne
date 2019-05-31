package com.example.lib;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=scanner.nextInt();
        int fact=1,i=1;
        /*
        for(i=1;i<=num;i++)
        {
            System.out.println("Value of i(Befor)"+i+" Value of Result(Befor)="+fact);
            fact=fact*i;
            System.out.println("Value of i(After)"+i+" Value of Result(After)="+fact);
        }
        System.out.println("(for)Factorial of Number="+fact);
    */
        /*
        while(i<=num)
        {
            System.out.println("Value of i(Befor)"+i+" Value of Result(Befor)="+fact);
            fact=fact*i;
            i++;
            System.out.println("Value of i(After)"+i+" Value of Result(After)="+fact);
        }
        System.out.println("(while)Factorial of Number="+fact);
        */
        do
        {
            if (num==0)
            {
                System.out.println("Factorial=1");
            }
            else {
                System.out.println("Value of i(Befor)=" + i + " Value of Result(Befor)=" + fact);
                fact = fact * i;
                i++;
                System.out.println("Value of i(After)=" + i + " Value of Result(After)=" + fact);
            }
        }while(i<=num);
        System.out.println("(do-while)Factorial of Number="+fact);

    }
}
