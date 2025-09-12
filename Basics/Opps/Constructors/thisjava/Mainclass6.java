package Opps.Constructors.thisjava;
class Person{
    String name;
    int age;
    char gender;
    Person(){
        name= "Shreyas H K";
        age = 22;
        gender = 'M';
    }
}
class Engineer extends Person{
    String degree;
    String specialization;
    Engineer(){
        degree ="BE";
        specialization="ISE";
    }
}   
public class Mainclass6 {
    public static void main(String[] args) {
        Engineer ee =  new Engineer();
        System.out.println(ee.name);
        System.out.println(ee.age);
        System.out.println(ee.gender);
        System.out.println(ee.degree);
        System.out.println(ee.specialization);
    }
}
