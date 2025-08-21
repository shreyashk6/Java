package Opps.Constructors.thisjava;
class City{
    City(){
        this(10);
        System.out.println("Bangalore");
    }
    City(int a){
        this(12,15);
        System.out.println("Mumbai");
    }
    City(int a, int b){
        
        System.out.println("Delhi");
    }
}
public class Mainclass2 {
    public static void main(String[] args) {
        // City c = new City();//Calls Bangalore (Empty)
        City c = new City(14,18);

    }
}
