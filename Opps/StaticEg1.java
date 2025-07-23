package Opps;

class DEmo {
  static int a = 100;

  static void test() {
    System.out.println("Executing test()...");
  }
}

public class StaticEg1 {
  public static void main(String[] args) {
    System.out.println(DEmo.a);
    DEmo.test();
  }
}
