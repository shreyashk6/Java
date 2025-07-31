package Opps.Constructors;

class Demo {
  Demo(int x) {
    System.out.println("Demo(int) constructor");
  }

  Demo(double d) {
    System.out.println("Demo(double) constructor");
  }

  Demo(String s) {
    System.out.println("Demo(String) constructor ");
  }
}

public class Mainclass7 {
  public static void main(String[] args) {
    Demo d1 = new Demo(10);
    Demo d2 = new Demo(10.5);
    Demo d3 = new Demo("Hello");
  }
}