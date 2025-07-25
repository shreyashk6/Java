package Opps.ClassObjects;
class Laptop{
    String model;
    double price;
    void coding(){
        System.out.println("Coding in Laptop mode: "+model);
    }
    void gaming(){
        System.out.println("Gaming Laptop price : "+price);
    }
}
public class Mainclass4 {
    public static void main(String[] args) {
        Laptop hp =  new Laptop();
        hp.model = "Elitebook";
        hp.price= 50000;
        hp.coding();
        hp.gaming();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Laptop Asus =  new Laptop();
        Asus.model = "ASUS TUF";
        Asus.price = 60000;
        Asus.gaming();
        Asus.coding();
    }
}