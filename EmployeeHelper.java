
import java.util.Scanner;

public class EmployeeHelper{
	static void displayEmployeeDetails(Employee e) {
		if(e!=null) {
			System.out.println("Employee ID: "+e.eid);
			System.out.print("Employee CTC: "+e.ctc);
		}
	}
	static Employeee createEmployee() {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter EID);
		int eid=scn.nextInt();
		System.out.print(("Enter CTC");
		double ctc=scn.nextDouble();
		Employee e=new Employee(eid,ctc);
		return e;
	}
}