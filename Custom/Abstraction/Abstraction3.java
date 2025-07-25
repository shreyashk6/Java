package Abstraction;


abstract class Calculate {
    public abstract int calc(int a,int b);
    public void displayAvg(){
        int res = calc(a,b);
        System.out.println("Result :"+res);
    }
}

class add extends Calculate{
    
    public int calc(int a, int b) {
    return a+b;
}
public class Abstraction3 {
    public static void main(String[] args) {
        Calculate my
    }
}
