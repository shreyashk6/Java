import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Program4 {
  public static void main(String[] args) {
    System.out.println("Enter your age : ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    System.out.println("Enter your height : ");
    Scanner scn = new Scanner(System.in);
    double height = scn.nextDouble();
    System.out.println("Are You Single : ");
    Scanner scc = new Scanner(System.in);
    boolean single = scc.nextBoolean();
    System.out.println("Enter your phone number");
    Scanner scs = new Scanner(System.in);
    long phoneno = scs.nextLong();
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Single ? : " + single);
    System.out.println("Phone Number: " + phoneno);
  }

}
