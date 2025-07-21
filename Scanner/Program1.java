import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    System.out.println("Enter a Value: ");
    Scanner scn = new Scanner(System.in);
    int val = scn.nextInt();
    scn.close();
    System.out.println("Value:" + val);
  }
}
