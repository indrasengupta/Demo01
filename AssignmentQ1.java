/*wap to demonstrate ternary operator.
 * define a variable marks.
 * ask its value from user and using ternary
 * operator check if marks > 40 store "Pass" in
 * result variable else store "Fail"
 */

import java.util.*; //used when we have to input the data from the user

public class AssignmentQ1 {

	public static void main(String[] args) {
	int Marks;
	String Result;
	
	Scanner m= new Scanner(System.in); //std formate for the import libary
	System.out.println("Enter the marks");
	Marks=m.nextInt();   //std formate for the import libary
	Result= Marks>=40? "Result: Pass":"Result: Fail"; //ternary operator
	System.out.println(Result);
   }
}
