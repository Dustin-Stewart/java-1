//fig 3.6: class Avg with sentinal coding
//solving class avg with counter controlled iteration

import java.util.Scanner; 																															//import scanner

public class SentinalAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 																									//create scanner
		
																																					//initializing phase
		
		int total = 0; //initialize sum of grades by students
		int gradecounter = 0; //initialize # of grade to be entered next
	
																																					//processing phase
	
		System.out.print("Enter grade, or type -1 to finish: ");
		int grade = input.nextInt();																											    // receives input next grade
	
		while (grade != -1) { 																														// while the counter is not equal to -1

			total += total + grade;			   																									    //add the grade to the total and store it in the total variable
			++gradecounter;																										//add 1 to the counter
			
			System.out.print("enter grade, or type -1 to finish: "); 																				 //prompt user for grade
			grade = input.nextInt();	
			
			}																																		//end statement. 
			
			if (gradecounter != 0) {				
																																					//termination phase
			double average = (double) total / gradecounter;				//
			
																																					//display phase (return data)
												
			System.out.printf("%nTotal of the %d grades is %d%n", gradecounter, total);  															//prints out in format: a new line "total of all grades is" %d=the next argument (the new total) and then a new line
			System.out.printf("Class avg is %.2f%n", average); 																						//prints on the next line "Class avg is %d(the next argument) then skpis to a new line. The next argument is the avg variable.
		}
			else {
			System.out.println("No grades were entered");
			}
	}
	
}