package Abstraction;

abstract class vehicle{
    abstract void start();       //RULE
    
    public void stop(){
        System.out.println("Stopping...(Common)!");
    }
}
class car extends vehicle{
    void start(){
        System.out.println("BRRRRR car......!");
    }
}

class motorcycle extends vehicle{
    void start(){
        System.out.println("GRRR bike");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        vehicle c1 = new car();
        c1.start();
        c1.stop();
        
        vehicle b1 = new motorcycle();
        b1.start();
        b1.stop();
    }
}
