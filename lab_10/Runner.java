import java.util.Scanner; 

/**
 * Sandbox for working with Fractions and exceptions for
 * Lab 10.
 *
 * @author 	Franklin D. Worrell
 * @version	19 July 2016
 */  
public class Runner {
	public static void main(String[] args) {
		// Create Scanner instance to get user input. 
		Scanner input = new Scanner(System.in); 
		
		// Get values for first Fraction and create it. 
		System.out.printf("Please enter the dividend Fraction's numerator: "); 
		int firstNum = input.nextInt(); 
		System.out.printf("Please enter the dividend Fraction's denominator: "); 
		int firstDen = input.nextInt(); 
		Fraction dividend = new Fraction(firstNum, firstDen); 
      
		boolean isInputValid = false;
      do {
   		// Get values for second Fraction and create it. 
   		System.out.printf("Please enter the divisor Fraction's numerator: "); 
   		int secondNum = input.nextInt(); 
   		System.out.printf("Please enter the divisor Fraction's denominator: "); 
   		int secondDen = input.nextInt(); 
   		Fraction divisor = new Fraction(secondNum, secondDen); 
   		
         try {
      		// Calculate quotient. Print results. 
      		Fraction quotient = dividend.divide(divisor); 
            isInputValid = true;
      		System.out.println("Their quotient is: " + quotient); 
         }      
         
         catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("Please enter a new second fraction"); 
         }
      }while(!(isInputValid));
	} // end method main
} // end class Runner