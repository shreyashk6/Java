public class Example3 {
  static char play() {
    return 'S';
  }

  static boolean help() {
    return true;
  }

  public static void main(String[] args) {
    char ch = play();
    System.out.println("Character Returned: " + ch);
    System.out.println("Character returned: " + help());
  }
}