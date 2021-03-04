//fig 3.6: class Avg
//solving class avg with counter controlled iteration

import java.util.Scanner; 						//import scanner

public class ClassAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
												//initializing phase
	
		int total = 0; //initialize sum of grades by students
		int gradecounter = 1; //initialize # of grade to be entered next
	
											    //processing phase
		
		while (gradecounter <=10) { 			//loop 10 times
			System.out.print("enter grade: ");  //prompt user for grade
			int grade = input.nextInt();	    // receives input next grade
			total = total + grade;			    //add the grade to the total and store it in the total variable
			gradecounter = gradecounter + 1;	//add 1 to the counter
			}									//end statement. this portion ends after the counter goes to 10
							
												//termination phase
			int average = total / 10;			//divide the new total by the number of students (10)
			
												//display phase (return data)
												
			System.out.printf("%nTotal of all grades is %d%n", total);  //prints out in format: a new line "total of all grades is" %d=the next argument (the new total) and then a new line
			System.out.printf("Class avg is %d%n", average); 			//prints on the next line "Class avg is %d(the next argument) then skpis to a new line. The next argument is the avg variable.
	}
	
}