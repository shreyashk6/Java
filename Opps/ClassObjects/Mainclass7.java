package Opps.ClassObjects;
class Pen{
    String color;
    double price;
    void write(){
        System.out.println("Writing in "+color+" pen cost is "+price);
    }
}
public class Mainclass7 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color="green";
        p1.price = 25;
        p1.write();

        Pen p2 = new Pen();
        p2.color="red";
        p2.price=30;
        p2.write();
    }
}