package Opps.Inheritance;
// final class A{   //can be Inherited cz of final keyword
//     System.out.println("YOI");
// }
 class A{
    final int x=50;
    final void play(){
        System.out.println("Yoi");
    }
}
class B extends A{

}
public class finalclassesInheritanceeg {
    public static void main(String[] args) {
        A aa= new A();
        
    }
}
