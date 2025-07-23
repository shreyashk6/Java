import java.util.Scanner;

public class Program6 {
  public static void main(String[] args) {
    System.out.print("Enter String: ");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    System.out.println("1st letter: " + ch);
    sc.close();

  }
}
