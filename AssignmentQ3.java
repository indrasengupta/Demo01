/*WAP to ask name ,age and salary of an employee and print on console.*/

import java.util.*;
public class AssignmentQ3 {

		String Name;
		int age;
		int Salary;
		
	    Void add()
		{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Employee name");
		Name=s.next();
		System.out.println("Enter Employee age");
		age=s.nextInt();
		System.out.println("Enter Employee Salary");
		Salary=s.nextInt();
		return null;
		}
		
		void display()
		{
			System.out.println(" Enter Employee= "+ Name);
			System.out.println(" Employee age= "+ age);
			System.out.println(" Employee Salary= "+ Salary);
		}
		public static void main(String[] args) {
		AssignmentQ3 s= new AssignmentQ3();
		s.add();
		s.display();
	}
}