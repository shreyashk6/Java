package Opps.Constructors;
class Iphone{
  Iphone(){
    System.out.println("iPhone");
  }
  Iphone(int price){
    System.out.println("Expensive: "+price + " INR");
  }
  Iphone(String model){
    System.out.println("iPhone model: " + model);
  }
}
public class Mainclass12 {
  public static void main(String[] args) {
    Iphone i1= new Iphone();
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    Iphone i2 =  new Iphone(230000);
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    Iphone i3 = new Iphone("iPhone 15 Pro Max");
  }
}
