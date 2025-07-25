    package Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Cat myCat= new Cat();
        myCat.makenoise();
    }
}


     abstract class Animal{
        int age;
        String  name;
        public abstract void makenoise();
    }
     class Cat extends Animal{

        @Override
        public void makenoise() {
            // TODO Auto-generated method stub
            System.out.println("Meowwwwwww!");  
        }   

    }   

