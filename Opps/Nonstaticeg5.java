package Opps;

class Beta{
  String str = "Shrey";
  char val = 'h';
  void help(){
    System.out.println("Helping.....");
  }
  void send(){
    System.out.println("Sending.............");
  }
}
class Utility{
  static int p = 10;
  int q =20;
  static void test(){
    System.out.println("Executing test().............");
  }
  void play(){
    System.out.println("Executing play()............");
  }
}
public class Nonstaticeg5 {
  public static void main(String[] args) {
    Beta b = new Beta();
    System.out.println(b.str);
    System.out.println(b.val);
    b.help();
    b.send();

    Utility U =  new Utility();
    System.out.println(Utility.p);
    System.out.println(U.q);
    U.play();
    Utility.test();

  }
}
