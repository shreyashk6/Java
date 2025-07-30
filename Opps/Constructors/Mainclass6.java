package Opps.Constructors;
class Person{
    String name;
    int age;
    char gender;
    Person(String s,int a, char c){
        name = s;
        age = a;
        gender=c;
    }
}
public class Mainclass6 {
    public static void main(String[] args) {
        Person p1 = new Person("Shreyas H K", 22, 'M');
        System.out.println("Name: "+p1.name+" age: "+p1.age+" Gender: "+p1.gender);

        Person p2 = new Person("Chutiya afran", 22, 'T');
        System.out.println("Name: "+p2.name+" age: "+p2.age+" Gender: "+p2.gender);
        
    }
}
