public class Example7 {
  static int square(int n) {
    int sq = n * n;
    return sq;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i + " Square is : " + square(i));
    }
  }
}
