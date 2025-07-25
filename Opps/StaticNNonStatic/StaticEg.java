package Opps.StaticNNonStatic;

class Sample {
  static int x = 100;
  static double y = 2.333;

  static void test() {
    System.out.println("Executing test().....");
  }

  static void play() {
    System.out.println("Executing play()........");
  }
}

public class StaticEg {
  public static void main(String[] args) {
    System.out.println(Sample.x);
    System.out.println(Sample.y);
    Sample.test();
    Sample.play();
  }

}
