package Opps.Constructors;

class City {
  City(int a) {
    System.out.println("new York");
  }

  City(int a, int b) {
    System.out.println("London ");
  }

  City(int a, int b, int c) {
    System.out.println("Paris");
  }
}

public class Mainclass8 {
  public static void main(String[] args) {
    City c1 = new City(10);
    City c2 = new City(10, 20);
    City c3 = new City(10, 20, 30);
  }
}