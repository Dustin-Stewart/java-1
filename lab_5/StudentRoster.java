import java.util.Scanner; 
import java.util.ArrayList; 

/**
 * A program that creates a class roster from names input by the user. It also
 * allows the user to remove students, check to see if a particular student is
 * enrolled, print the roster, and check the size of the class. 
 *
 * @author	Franklin D. Worrell
 * @revised	18 September 2016, 20:00 
 */ 
public class StudentRoster {
	// Initialize a Scanner instance to get user input from terminal. 
	private static Scanner input = new Scanner(System.in); 
	
	// Initialize an ArrayList to hold the students' names. 
	private static ArrayList<String> roster = new ArrayList<String>(); 
	
	public static void main(String[] args) {
		// Initialize a boolean value to control program loop. 
		boolean runProgram = true; 
		
		// Loop until the user decides to quit the program. 
		while (runProgram) {
		
			// Print the main menu and store the user's choice. 
			int userChoice = printMenu(); 
			
			// User wants to add a student to the roster. 
			if (userChoice == 1) { 
				addStudent(); 
			} 
				
			// User wants to remove a student from the roster. 
			else if (userChoice == 2) { 
				removeStudent(); 
			}
					
			// User wants to see if a particular student is enrolled. 
			else if (userChoice == 3) {
				checkEnrollment(); 
			}	
			
			// User wants to view the entire roster. 
			else if (userChoice == 4) {
				printRoster(); 
			} 
					
			// User wants to view the number of students enrolled. 
			else if (userChoice == 5) {
				printClassSize(); 
			}
				
			// User wants to quit the program. 
			else if (userChoice == 6) {
				System.out.println("Thank you! Have a nice day!"); 
				runProgram = false; 
			} 
					
			// User entered invalid input. 
			else {
				System.out.println("Please only enter an integer 1-6."); 
				System.out.println("Please try again."); 
			}
		}// end main program loop. 
	} // end method main
	
	
	/**
	 * Prints the program's menu. Asks the user for a choice and returns that 
	 * choice as an integer. 
	 *
	 * @return	the user's choice of menu option
	 */ 
	private static int printMenu(){ 
		// Print menu options for user. 
		System.out.println("Please select from one of the following options: "); 
		System.out.println("	1) Add a student, "); 
		System.out.println("	2) Remove a student, "); 
		System.out.println("	3) Check enrollment of a student, ");
		System.out.println("	4) Print the roster, "); 
		System.out.println("	5) Get the number of enrolled students, or "); 
		System.out.println("	6) Quit."); 
		
		// Return the user's choice. 
		int userChoice = Integer.parseInt(input.nextLine()); 
		return userChoice; 	
	} // end method printMenu 
	
	
	/**
	 * Asks the user for the name of the student to add and adds the name 
	 * provided by the user to the class roster. 
	 */ 
	private static void addStudent(){
		
		// Ask the user to enter the new student's name. 
		System.out.println("Enter the new Student's name");
		// Add the name of the student to the ArrayList. 
		String newName = input.nextLine();
		roster.add(newName);
	} // end method addStudent
	
	
	/**
	 * Asks the user for the name of the student to remove and removes the
	 * name provided by the user if it is in the class roster. 
	 */ 
	private static void removeStudent() { 
		
		// Ask the user to enter the name of the student being removed. 
		System.out.println("Enter the Student's name");
		// Find that student's name in the ArrayList and remove it. 
		String newName = input.nextLine();
		roster.remove(newName);
		/* Side note: How should handle the case where the student entered is 
		   not actually in the class? If time permits, please handle this case. */ 
	} // end method removeStudent
	
	
	/**
	 * Asks the user for the name of a student and reports whether or not the
	 * queried student is in the class. 
	 */ 
	private static void checkEnrollment() {
		 
		
		// Ask the user to enter the name of the student they want to know about.
		System.out.println("Enter the Student's name");
		// Check to see if the student is in the class. 
		String newName = input.nextLine();
		boolean enrollment = roster.contains(newName);
		// If the student is in the class
			// Print a message saying so. 
		if (enrollment==true){
			System.out.println("The student is in the class.");
		}
		// Otherwise
			// Print a message saying the student is not enrolled in the course. 
		else if (enrollment==false){
			System.out.println("the student is not in the class");
		}
	} // end method checkEnrollment
	
	
	/**
	 * Prints the class roster. 
	 */ 
	private static void printRoster() {
		/* Stubbed */ 
	String print = roster.toString();
	System.out.println(print);
		// Print the elements of the ArrayList. 
		/* See if you can find a method that does the work for you! */ 
	}  // end method printRoster
	
	
	/**
	 * Prints the number of students in the class, which is just the size of
	 * the ArrayList.
	 */ 
	private static void printClassSize() {
		/* Stubbed */ 
		int printSize = roster.size();
		System.out.println(printSize);
		// Print the size of the ArrayList.
	} // end method printClassSize
} // end class ExerciseFive 