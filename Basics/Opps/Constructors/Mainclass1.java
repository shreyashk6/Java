package Opps.Constructors;
class Demo{
    int a=10;
    void test(){
        System.out.println("Executing test()............");
        //System.out.println(a);
    }
}
public class Mainclass1 {
    public static void main(String[] args) {
        Demo ref=new Demo();
        System.out.println(ref.a);
        ref.test();
    }
}
