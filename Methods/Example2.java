public class Example2 {
  static double disp(){
    return 3.14;
  }
  public static void main(String[] args) {
    double value = disp();
    System.out.println("Returned Value: " + value);
    System.out.println("Returned value: " + disp());
  }
}
