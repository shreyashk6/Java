public class Example6 {
  static boolean checkvehiclespeed(int speed) {
    int speedLimit = 100;
    if (speed > speedLimit) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println("Overspeeding..." + checkvehiclespeed(120));
    System.out.println("Overspeeding..." + checkvehiclespeed(80));
  }

}
