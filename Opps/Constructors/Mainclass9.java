package Opps.Constructors;

class Biryani {
  Biryani(int a, String s) {
    System.out.println("Chicken Biryani");
  }

  Biryani(String s, int a) {
    System.out.println("Paneer Biryani");
  }
}

public class Mainclass9 {
  public static void main(String[] args) {
    Biryani b1 = new Biryani(10, "Chicken");
    Biryani b2 = new Biryani("Paneer", 20);
  }
}
