package Opps.UpCasting;
class A{
    void test(){
        System.out.println("test()...");
    }
}
class B extends A{
    void disp(){
        System.out.println("disp()...");
    }
}
class C extends B{
    void ping(){
        System.out.println("ping()...");
    }
}
public class Mainclass4 {
    public static void main(String[] args) {
        C c1 =  new C();
        c1.test();
        c1.disp();
        c1.ping();

        B b1 = c1; //UPCASTING C----> B
        b1.test();
        b1.disp();
        
        A a1 = c1;//UPCASTING: C------>A
        a1.test();
    }
}
