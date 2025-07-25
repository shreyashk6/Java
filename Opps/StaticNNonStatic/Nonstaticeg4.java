package Opps.StaticNNonStatic;
class Beta{
  String str = "Shrey";
  char val = 'h';
  void help(){
    System.out.println("Helping.....");
  }
  void send(){
    System.out.println("Sending.............");
  }
}
public class Nonstaticeg4 {
  public static void main(String[] args) {
    Beta b = new Beta();
    System.out.println(b.str);
    System.out.println(b.val);
    b.help();
    b.send();
  }
}
