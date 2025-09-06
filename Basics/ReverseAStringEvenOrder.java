public class ReverseAStringEvenOrder {
  public static void main(String[] args) {
    String s1 = "hello hi bye how are you";
    String[] s2 = s1.split(" ");

    for (int i = 0; i < s2.length; i++) {
      if (i % 2 == 0) {
        System.out.print(s2[i] + " ");
      } else {
        revers(s2[i]);
        System.out.print(" ");
      }
    }

  }

  static void revers(String a) {
    for (int i = a.length() - 1; i >= 0; i--) {
      System.out.print(a.charAt(i));
    }
  }

}
