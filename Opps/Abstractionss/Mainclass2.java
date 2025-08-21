public class Mainclass2 {
  public static void main(String[] args) {
    Alpha ref =  new Beta();
    ref.play();
    ref.help();
  }
}
abstract class Alpha{
  abstract void play();
  void help(){
    System.out.println(("Executing help()...."));
  }
}
class Beta extends Alpha{
  @Override
  void play(){
    System.out.println("Executing play()....");
  }
}