package Opps.Constructors.thisjava;
class Demo{
    Demo(){
        System.out.println("Demo() Constructor");
    }
}
class Sample extends Demo{
    Sample(){
        super();    // super() KEYWORD IF WE DIDNT DECLARE THE COMPILER AUTOMATICALLY DECLARES
        System.out.println("Sample() Constructor");
    }
}
public class Mainclass4 {
    public static void main(String[] args) {
        Sample ref =  new Sample();
    }
}
