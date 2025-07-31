package Opps.Constructors;
class Curve{
  Curve(int a){
    System.out.println("Curve Petrol Variant");
  }
  Curve(double b){
    System.out.println("Curve Diesel Variant");
  }
  Curve(String c){
    System.out.println("Curve Electric Variant");
  }
}
public class Mainclass13 {
  public static void main(String[] args) {
    Curve c1 = new Curve(1500);
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    Curve c2 = new Curve(2000.50);
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    Curve c3 = new Curve("Curve EV");
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
  }
}
