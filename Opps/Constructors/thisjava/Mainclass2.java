// package Opps.Constructors.thisjava;
class City{
    City(){
        this(10);//calls mumbai
        System.out.println("Bangalore");//3rd exe
    }
    City(int a){
        this(12,15);//calls delhi
        System.out.println("Mumbai");//2nd exe
    }
    City(int a, int b){

        System.out.println("Delhi");//executes1st
    }
}
public class Mainclass2 {
    public static void main(String[] args) {
        City c = new City();//Calls Bangalore (Empty)
        // City c = new City(14,18);
           
    }
}
