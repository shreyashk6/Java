import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    System.out.println("Enter 1st num : ");
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    System.out.println("Enter 2nd number ; ");
    Scanner scn = new Scanner(System.in);
    double num2 = sc.nextDouble();
    double Sum = num1 + num2;
    System.out.println("Sum of 2 numbers: " + Sum);
    sc.close();
    scn.close();
  }

}
