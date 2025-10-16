// package Opps.StaticNNonStatic;

class Delta {
  int a = 26;

  void test() {
    System.out.println("Executing test()....");
  }
}

public class Nonstaticeg1 {
  public static void main(String[] args) {
    System.out.println(new Delta().a);

    // Delta d = new Delta();
    // d.test();
    new Delta().test();//both r same   but here we arent saving object in memory
  }
}