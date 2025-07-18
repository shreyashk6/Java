public class Example1 {
  static int test() {
    return 25;
  }

  public static void main(String[] args) {
    int val = test();
    System.out.println("Returned Value: " + val);
    System.out.println("Returned value: " + test());
  }
}