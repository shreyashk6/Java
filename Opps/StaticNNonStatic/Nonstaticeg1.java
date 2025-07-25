package Opps.StaticNNonStatic;

class Delta {
  int a = 26;

  void test() {
    System.out.println("Executing test()....");
  }
}

public class Nonstaticeg1 {
  public static void main(String[] args) {
    System.out.println(new Delta().a);
    new Delta().test();
  }
}