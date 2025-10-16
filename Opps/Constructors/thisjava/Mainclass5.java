// package Opps.Constructors.thisjava;
class Alpha{
    Alpha(){
        this(23);//callls alohha int a
        System.out.println("Alpha() constructor");
    }
    Alpha(int a){
        System.out.println("Alpha(int) Constructor");
    }
}
class Beta extends Alpha{
    Beta(){
        super();// USED TO CALL THE MAIN CLASS CONSTRUCTOR THAT IS Alpha()
        System.out.println("Beta()  Constructor");
        
    }
}
public class Mainclass5 {
    public static void main(String[] args) {
        Beta ref = new Beta();//calls beta
    }
}
