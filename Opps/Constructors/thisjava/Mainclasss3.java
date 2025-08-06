package Opps.Constructors.thisjava;
class Amazon{
    Amazon(){
        System.out.println("Code to Initialize Shopping");
    }
    Amazon(double subscription){
        this(); //Calls Above Amazon()
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
