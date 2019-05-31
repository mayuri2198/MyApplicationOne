package com.example.lib;

import java.util.Scanner;

class p{
     p()
     {
         System.out.println("Principal");
     }
  int pvalue()
  {
    int p;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the principal::");
      p = scanner.nextInt();
      System.out.println("The Principal::"+p);
      return p;
     }
}
class R extends p
{
    R()
    {
        System.out.println("Rate");
    }
    int rvalue()
    {
        int r;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rate::");
        r = scanner.nextInt();
        System.out.println("The rate::"+r);
        return r;
    }
}
class T extends R {
    T() {
        System.out.println("Time");
    }

    int tvalue() {
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Time::");
        t = scanner.nextInt();
        System.out.println("The Time::" + t);
        return t;
    }
}
public class Interest1 extends T{
    public static void main(String[] args) {
        System.out.println("simple Interest");
        T tt = new T();
        int pv=tt.pvalue();
        int rv=tt.rvalue();
        int tv=tt.rvalue();

        float si=((pv*rv*tv))/100;
        System.out.println("The Simple Interest::"+si);
    }
}