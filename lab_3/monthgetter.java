//dustin stewart 9.13
//monthgetter

import java.util.Scanner;

public class monthgetter{									//declare class
	public static void main(String[] args){						//declare method
		Scanner input= new Scanner(System.in);				//Assign scanner
		
		int month;											//declare variable for the month
		
		do {												//declare the do	
			System.out.println("Enter a month number (1-12)");			//prompt for input from the do
			month = input.nextInt();						//capture the input
			
		} while (!((month>=1)&&(month<=12)));
		System.out.println("You picked month "+month);
			
		
		
		
	} //end main method
} //end class	