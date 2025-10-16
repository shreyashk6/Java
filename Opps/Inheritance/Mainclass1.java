// package Opps.Inheritance;
class Demo{
    int val=20;
    void help(){
        System.out.println("Executing help()....");
    }
}
class Sample extends Demo{

}
public class Mainclass1 {
    public static void main(String[] args) {
        
        Sample ref=new Sample();//call child class in inheritance easy
        System.out.println(ref.val);
        ref.help();
    }
}
7