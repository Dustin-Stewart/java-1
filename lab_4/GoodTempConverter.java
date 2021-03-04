import java.util.Scanner; 

/**
 * A program that converts Fahrenheit to Celsius and vice versa. This 
 * version of the program is poorly constructed with all of the code
 * in the main method. 
 *
 * Remember: 
 * 		tempCelsius = (tempFahr - 32) / 1.8 
 * 		tempFahr = tempCelsius * 1.8 + 32
 *
 * @author 	Dustin Stewart
 * @version	9/20/17
 */ 
public class GoodTempConverter {
	static Scanner input = new Scanner(System.in); 
		static	double tempCelsius; 
		static	double tempFahr; 
		
		public static void main(String[] args) {
		
		int userChoice = 0; 

		// Loop until user opts to quit program. 
		while (userChoice != 3) {
			printMenu();
			
			// Get user's choice. 
			userChoice = input.nextInt(); 
			// ececute users choice
			executeChoice(userChoice);
			
		} // end main program loop
	} // end method main
	private static void printMenu(){
	
				// Print the user's options. 
			System.out.println("Please select one of the following options: "); 
			System.out.println("	1. Convert Fahrenheit to Celsius; "); 
			System.out.println("	2. Convert Celsius to Fahrenheit; or "); 
			System.out.println("	3. Quit "); 
	} //end method printMenu
	
	private static void fahrToCels(){                                    // User wants to convert Fahrenheit to Celsius. 
			System.out.printf("Please enter the temperature in Fahrenheit: "); 
			tempFahr = input.nextDouble(); 
			tempCelsius = (tempFahr - 32) / 1.8; 
			System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.%n",tempFahr, tempCelsius); 
	}
	
	private static void celsToFahr(){                                     // User wants to convert Celsius to Fahrenheit.
			System.out.printf("Please enter the temperature in Celsius: "); 
			tempCelsius = input.nextDouble(); 
			tempFahr = tempCelsius * 1.8 + 32; 
			System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n",tempCelsius, tempFahr); 
	}
	
	private static void executeChoice(int userChoice){
		if (userChoice == 1) {
				fahrToCels();
			} 

			else if (userChoice == 2) {
				celsToFahr();
			} 
			
			// User wants to quit the program. 
			else if (userChoice == 3) {
				System.out.println("Thanks! Have a nice day!");  
			} 
			
			// User entered invalid input. 
			else {
				System.out.println("Invalid input. Please enter only 1, 2, or 3."); 
			} 
	}
} // end class BadTempConverter