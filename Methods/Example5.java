public class Example5 {
  static int verify(int num){
    if(num % 2 == 0) {
      return num+=5;
    } else {
      return num-=5;
    }
  }
  public static void main(String[] args) {
    System.out.println("Result: " + verify(10));
    int result = verify(15);
    System.out.println("Result: " + result);
  }
}
