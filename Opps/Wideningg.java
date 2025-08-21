package Opps;

public class Wideningg {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // WIDENING : int -----> double
        System.out.println(b);

        char c = 'a';
        int d = c; // WIDENING : char -----> int
        System.out.println(d);

        long e = 3456789543L;
        float f = e; // WIDENING : long -----> float
        System.out.println(f);
    }
}
