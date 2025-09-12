package Opps.Constructors.thisjava;
class Hotel{
    Hotel(int a){
        this(3.33);
        System.out.println("Mc donalds");
    }
    Hotel(double b){
        this("yo");
        System.out.println("Dominos");
    }
    Hotel(String s){
        System.out.println("KFC");
    }
}
public class Mainclass1 {
    public static void main(String[] args) {
        Hotel h =  new Hotel(10);
    }
}
