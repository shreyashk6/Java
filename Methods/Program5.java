public class Program5 {
  static void test() {
    System.out.println("Test starts");
    System.out.println("Test ends");
  }

  static void disp() {
    System.out.println("Disp starts");
    test();
    System.out.println("Disp ends");
  }

  public static void main(String[] args) {
    System.out.println("Main starts");
    disp();
    System.out.println("Main ends");
  }
}
