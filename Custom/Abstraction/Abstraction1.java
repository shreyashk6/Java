package Abstraction;


abstract class  animal{ //Creating a method common to all animals...
    public void sleep(){
        System.out.println("Animals are sleeping...Zzz");
    }    
}
class Dog extends animal{
    public void makesound() {
        System.out.println("Bark");
    }
}
class cat extends animal{
    public void makesound(){
        System.out.println("Meow");
    }
}
public class Abstraction1 {
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.makesound();
            myDog.sleep();

            cat myCat = new cat();
            myCat.makesound();
            myCat.sleep();
        }
}
