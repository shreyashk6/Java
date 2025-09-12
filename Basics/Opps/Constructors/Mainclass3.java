package Opps.Constructors;
class Example{
    int a ;
    Example(){
        System.out.println("Example Contructor.");
        a=100;
    }
}
public class Mainclass3 {
    public static void main(String[] args) {
        Example eg =  new Example();
        System.out.println(eg.a);
    }
}
