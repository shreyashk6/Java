// package Opps.Inheritance;
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
        Beta obj =  new Beta();//calling child class
        obj.test();//inheritated already from parent class thats why we can call child class
        obj.disp();

        Alpha al =  new Alpha();
        al.test();
        //al.disp(); //PARENT CLASS CANNOT INHERIT CHILD CLASS
    }
}
