package Opps.MethodOverloadingJava;
class Exxample{
    void display(){
        System.out.println("Java Full Stack");
    }
    void display(boolean a){
        System.out.println("Mern Stack");
    }
}
public class Mainclass3 {
    public static void main(String[] args) {
        Exxample eg = new Exxample();
        eg.display();
        eg.display(true);
    }
}
