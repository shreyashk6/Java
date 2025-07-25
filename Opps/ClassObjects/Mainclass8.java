package Opps.ClassObjects;
class Person{
    int age;
    double height;
    double weight;
    
}
public class Mainclass8 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=25;
        p1.weight=71;
        p1.height=6.0;
        System.out.println("Age : "+p1.age+" Height : "+p1.height+ " Weight : "+p1.weight);

        Person p2 = new Person();
        p2.age=29;
        p2.weight=69;
        p2.height=5.11;
        System.out.println("Age : "+p2.age+" Height : "+p2.height+ " Weight : "+p2.weight);
    }
}
