package Opps.Constructors.thisjava;
class Delta{
    Delta(){
        this(10);
        System.out.println("A");
    }
    Delta(int x){
        System.out.println("B");
    }
}
class Example extends Delta{
    Example(){
        System.out.println("c");
    }
    Example(int x){
        //super();
        System.out.println("D");
    }
}
public class Mainclass7 {
    public static void main(String[] args) {
        Example e1 =  new Example(15);
    }
}
