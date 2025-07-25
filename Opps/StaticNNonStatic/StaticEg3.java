package Opps.StaticNNonStatic;

class Alpha {
  static String str = "Shrey";
  static boolean bool = true;

  static void help() {
    System.out.println("help meeeeeeee");
  }

  static void send() {
    System.out.println("Sending...");
  }
}

public class StaticEg3 {
  public static void main(String[] args) {
    System.out.println(Alpha.str);
    System.out.println(Alpha.bool);
    Alpha.help();
    Alpha.send();
  }
}
