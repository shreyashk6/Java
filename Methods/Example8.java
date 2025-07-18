public class Example8 {
  static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i + " Factorial is : " + factorial(i));
    }
  }
}
