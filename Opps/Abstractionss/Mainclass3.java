public class Mainclass3 {
  public static void main(String[] args) {
    Delta  ref =  new Example();
    ref.start();
    ref.end();
  }
}
abstract class Delta{
  void start(){
    System.out.println("Start()");
  }
  void end(){
    System.out.println("End()");
  }
}
class Example extends Delta{


}