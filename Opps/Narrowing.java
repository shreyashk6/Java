package Opps;

public class Narrowing {
    public static void main(String[] args) {
        double p=4.5;
        int q =(int)p;  // NARROWING : DOUBLLE ----> INT
        System.out.println(q);

        int x =65;
        char y=(char)x; //NARROWING 
        System.out.println(y);

        float i =12.3f;
        long j = (long)i;//NARROWING
        System.out.println(j);
    }   
}
