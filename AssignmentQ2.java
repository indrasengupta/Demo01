/*using ternary check if number eneterd by user is positive or negative .
In case number is positive store "Positive number" else store negative number to Result variable*/

import java.util.*;

public class AssignmentQ2 {
	
public static void main(String[] args) {
	int Number;
	String Result;
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the Number");
	Number=s.nextInt();
	Result = Number>0? "Valve is positive":"valve is negative";
	System.out.println(Result);
	
}
}
