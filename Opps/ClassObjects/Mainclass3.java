package Opps.ClassObjects;


class Bike{
    int cc;
    double mileage;
    void drive(){
        System.out.println("Driving Bike CC: "+cc+" and milleafe is : "+mileage);
    }
    void clean(){
        System.out.println(("Getting cleaned"));
    }
}
public class Mainclass3 {
    public static void main(String[] args) {
    Bike ktm =  new Bike();
    ktm.cc=390;
    ktm.mileage=12.0;
    ktm.drive();
    ktm.clean();

    Bike re = new  Bike();
    re.cc = 650;
    re.mileage = 17.0;
    re.drive();
    re.clean();
    }
}
