package Opps.Inheritance;
class Alpha{
    void test(){
        System.out.println("TEST()........");
    }
}
class Beta extends Alpha{
    void disp(){
        System.out.println("DISP().......");
    }
}
public class Mainclass2 {
    public static void main(String[] args) {
        Beta obj =  new Beta();
        obj.test();
        obj.disp();

        Alpha al =  new Alpha();
        al.test();
        //al.disp(); //PARENT CLASS CANNOT INHERIT CHILD CLASS
    }
}
