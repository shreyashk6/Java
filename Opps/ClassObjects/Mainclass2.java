package Opps.ClassObjects;

class Employee {
  int id;
  double ctc;

  void work() {
    System.out.println("Employee is working,The ID is: " + id);
  }

  void meeting() {
    System.out.println("Employee in meeting,The CTC is: " + ctc);
  }
}

public class Mainclass2 {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.id = 101;
    e1.ctc = 4.5;
    e1.work();
    e1.meeting();
    System.out.println("------------------------------------------------------------------------");
    Employee e2 = new Employee();
    e2.id = 102;
    e2.ctc = 5.5;
    e2.work();
    e2.meeting();
  }
}
