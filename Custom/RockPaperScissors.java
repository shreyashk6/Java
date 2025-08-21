import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    String[] arr = { "Rock", "Paper", "Scissors" };
    int up = 0, cp = 0, r = 1;
    Scanner ip = new Scanner(System.in);
    System.out.println("=====Welcome To RPS Game====");
    System.out.println("PLease Enter the Targer Score");
    int t = ip.nextInt();
    System.out.println("Game Begins............!");

    while (true) {
      System.out.println("=====Round: " + r + " =====");
      System.out.println("Player Enter Your choice");
      String ui = ip.next();
      String ci = arr[(int) (Math.random() * arr.length)];
      System.out.println(ci);
      if (ci.equals(ui)) {
        System.out.println("Round Draw");
      } else if (ci.equals("Rock") && ci.equals("Scissors") || ci.equals("Paper") && ci.equals("Rock")
          || ci.equals("Scissors") && ci.equals("Paper")) {
        System.out.println("User Won The Round!");
        up++;
      }
       else {
        System.out.println("Computer Won The round!");
        cp++;
      }
      System.out.println("points:");
      System.out.println("User: " +up+ "  Computer: " +cp);

      if (cp == t) {
        System.out.println("Computer One The Game!");
        System.exit(0);
        
      } else if(up==t){
        System.out.println("User Won The Game");
        System.exit(0);
      }

      r++;
    }
  }
}
