import java.util.Scanner;

public class Program5 {
  public static void main(String[] args) {
   System.out.println("Enter your state: ");
    Scanner sc = new Scanner(System.in);
    String state = sc.nextLine();
    System.out.println("You are from " + state);
    sc.close();
  }

}

