package com.example.lib;
class Pulavmuxak
{
    Pulavmuxak()
    {
        System.out.println("Mayuri Shivaji Gaikwad");
    }
}
public class khichdi extends Pulavmuxak implements Mulakat
{
    public static void main(String[] args) {
        System.out.println("Innovation makes a follower into a leader");
        Pulavmuxak pulavmuxak=new Pulavmuxak();
        khichdi khichdi=new khichdi();
        khichdi.mulakat();
        khichdi.duri();
        khichdi.duri();
    }

    @Override
    public void mulakat() {
        System.out.println("Good Afternoon");
    }

    @Override
    public void duri() {
    System.out.println("Good Evening");
    }

    @Override
    public void duri(int zakas, int bakwass)
    {
    System.out.println("Happy Sunday");
    }

    @Override
    public void gapbas(float taooo, float dhoop)
    {
      System.out.println("Happy Diwalis");
    }

    @Override
    public int kabhi(int khushi, int gam)
    {
        int karan=khushi+gam;
        System.out.println("Sum of the number::"+karan);
        return karan;
    }

    @Override
    public double shaktiman(double gangadhar, double kapala) {
        return 0;
    }

    @Override
    public int varun(int dana, int dan, int doo) {
        return 0;
    }

    @Override
    public double aauu(int nandu, float sabka, double bandhu) {
        return 0;
    }
}
