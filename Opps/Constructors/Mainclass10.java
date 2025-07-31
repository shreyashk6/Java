package Opps.Constructors;

class Amazon {
  Amazon() {
    System.out.println("Initializing Amazon");
  }

  Amazon(double SuscriptionFees) {
    System.out.println("Initializing Shopping");
    System.out.println("Initializing Prime Video");
    System.out.println("Initializing Prime Music");
  }
}

public class Mainclass10 {
  public static void main(String[] args) {
    Amazon a1 = new Amazon();
    System.out.println(
        "-----------------------------------------------------------------------------------------------------------------");
    Amazon a2 = new Amazon(1499.0);
  }
}
