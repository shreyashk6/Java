package Opps.UpCasting;
class Alpha{
    void help(){
        System.out.println("Executing help()...");
    }
}
class Beta extends Alpha{
    void send(){
        System.out.println("Executing Send()...");
    }
}
public class Mainclass2 {
    public static void main(String[] args) {
        Beta ref =  new Beta();
        ref.help();
        ref.send();
        Alpha obj =  ref; // UPCASTING BETA----> ALPHA.
        obj.help();
        //obj.send();---> CTE After Upcasting we cannot access sub-class properties.
        
    }
}
