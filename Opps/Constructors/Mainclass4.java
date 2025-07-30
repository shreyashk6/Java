package Opps.Constructors;
class Delta{
    int a ;
    char c;
    Delta(){
        a=10;
        c='a';
    }
}
public class Mainclass4 {
    public static void main(String[] args) {
        Delta ref = new Delta();
        System.out.println(ref.a);
        System.out.println(ref.c);
    }
}
