package Opps.MethodOverloadingJava;

public class Mainclass1 {
    public static void main(String[] args) {
        Demo ref= new Demo();
        ref.play(5);
        ref.play("");
        ref.play(3.333333);
    }
}
class Demo{
    void play(int a){
        System.out.println("Hockey");
    }
    void play(String s){
        System.out.println(("Cricket"));
    }
    void play(double d){
        System.out.println("Badminton");
    }
}