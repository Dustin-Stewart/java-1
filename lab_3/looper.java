//dustin stewart 9.13.17
//looper program 1
import java.util.Scanner;															//import scanner
	
public class looper{																//declare class	
		public static void main(String[] args){									//declare main method
			Scanner input = new Scanner(System.in);							//set up Scanner
				
				int iterations;													//declare variable
				
				System.out.println("How many iterations would you like?");       //prompt user
				iterations = input.nextInt();									//get user input for an int
				
					for (int counter = 0; counter < iterations; counter++){			//declare for statement (initialize a variable, set control statement, add one to the counter)
					System.out.println("counter = " + counter);					//print out number of counters until the number of counters is greater than what the user entered
					
					
					} 														//end for statement
		
	} 																		//end main method
} 																					//end class

	