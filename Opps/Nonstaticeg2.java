package Opps;

class Example {
  int x = 15;
  double y = 14.5;

  void disp() {
    System.out.println("Executing disp()...");
  }

  void play() {
    System.out.println("Executing play()....");
  }
}

public class Nonstaticeg2 {
  public static void main(String[] args) {
    Example ref = new Example();
    System.out.println(ref.x);
    System.out.println(ref.y);
    ref.disp();
    ref.play();
  }
}
