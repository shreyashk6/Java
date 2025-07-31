package Opps.Constructors;
class Student{
  Student(){
    System.out.println("Inititalize Student Information");
    }
  Student(boolean exp){
    System.out.println("Inititalize Student Information with Experience");
    System.out.println("Experience: " + exp);
  }
}

public class Mainclass11 {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    Student s2 = new Student(true);
  }
}
