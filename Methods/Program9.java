public class Program9 {
  static void sub(int a, int b) {
    int res = a - b;
    System.out.println(a + "-" + b + "= " + res);

  }

  static void add(int a, int b) {
    int res = a + b;
    System.out.println(a + "+" + b + "= " + res);
  }

  static void mul(int a, int b) {
    int res = a * b;
    System.out.println(a + "*" + b + "= " + res);
  }

  static void div(int a, int b) {
    if (b != 0) {
      int res = a / b;
      System.out.println(a + "/" + b + "= " + res);
    } else {
      System.out.println("Division by zero is not allowed.");
    }
  }

  public static void main(String[] args) {
    sub(10, 5);
    add(10, 5);
    mul(2, 6);
    div(10, 2);
  }

}
