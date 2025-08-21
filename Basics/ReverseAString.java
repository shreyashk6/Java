public class ReverseAString {
  public static void main(String[] args) {
    String s1 = "Hello hi bye how are you";
    String arr1[] = s1.split(" ");

    for (int i = arr1.length - 1; i >= 0; i--) {
      System.out.print(arr1[i]+" ");
    }
  }
}
