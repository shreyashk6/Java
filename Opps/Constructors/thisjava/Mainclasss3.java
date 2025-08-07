package Opps.Constructors.thisjava;
class Amazon{
    Amazon(){
        System.out.println("Code to Initialize Shopping");
    }
    Amazon(int a){
        this();
        System.out.println("Add to Cart!");
    }
    Amazon(double subscription){
        this(1); //Calls Above Amazon()
        System.out.println("Code to Initialize Prime Video");
        System.out.println("Code to Initialize Prime Music");
    }
}
public class Mainclasss3 {
    public static void main(String[] args) {
        Amazon regular = new Amazon();
        System.out.println("===================================================================================================================");
        Amazon prime = new Amazon(1299.0);
    }
}
