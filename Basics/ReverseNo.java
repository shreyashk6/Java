public class ReverseNo {
  public static void main(String[] args) {
    int n = 5873;
    int rem = 0;

    while (n != 0) {
      rem = n % 10;
      System.out.print(rem);

      n = n / 10;

    }
  }
}
