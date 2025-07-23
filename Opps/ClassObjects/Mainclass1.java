package Opps.ClassObjects;

class Student {
  String name;
  double cgpa;

  void study() {
    System.out.println(name + " Studying....");
  }

  void write() {
    System.out.print("has " + cgpa);
  }
}

public class Mainclass1 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Shreyas";
    s1.cgpa = 7.47;
    s1.study();
    s1.write();
    System.out.println("----------------------------------------------------------");
    Student s2 = new Student();
    s2.name = "Afran";
    s2.cgpa = 7.5;
    s2.study();
    s2.write();
  }
}
