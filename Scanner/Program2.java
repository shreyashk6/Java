import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    System.out.print("Enter Your Age : ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    sc.close();
    if (age >= 18) {
      System.out.println("maajor");
    } else {
      System.out.println("Minor");
    }
    

  }

}
