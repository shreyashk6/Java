public class SumofEvenDigits {

  public static void main(String[] args) {
    int n = 5678;
    int rem = 0;
    int sum = 0;
    while (n != 0) {
      rem = n % 10;
      // System.out.print(rem);
      if (n % 2 == 0) {
        sum = sum + rem;
      }

      n = n / 10;

    }
    System.out.println(sum);

  }
}
