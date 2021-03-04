//fig 2.7:Addition.java
//a fucking adding machine that inputs two numbers and gives a smart ass response that is the sum

import java.util.Scanner; 										/*capitoltize that fucking Scanner when you invoke that shit. 
																we need to import this fine white powder (class) from the java library in columbia*/

		public class Addition { 								//i do declare, this class is hereforth known as Addition
			
			public static void main(String [] args) {			//method declaration on that ass
			
				Scanner input = new Scanner(System.in);			/*the word input is gonna be like...idk... EQUAL TO WHATEVER VALUE I JUST SET IT TO
																BASICALLY NEW(KEYWORD) SCANNER(SYSTEM.IN) IS ANOTHER METHOD THAT TAKES THE INPUT AND FUCKIN
																SWITCHES THAT SHIT IN WHEN I TYPE INPUT DUDE AKA A VARIABLE DECLARATION STATEMENT*/
					
				System.out.print("type the first interger, bitch: "); //prompted that ass. STRAIGHT OUTTA PROMPTON
				int num1 = input.nextInt();						//we takin yo digits! we aint gonna call you! iniTIALIZE!
				
				System.out.print("type the other number, bitch: ");	//PROMPTED, YET THE FUCK AGAIN
				int num2 = input.nextInt();						//need i remind you that we're takin the interger dawg? from the input??!
				
				int sum = num1 + num2;							//this shit alreday know how ta add, im mad at dat.
				
				System.out.printf("The fuckin sum is %d%n", sum);  //we bout to get some answers
	
	} 																//end the main fuckin method			
} 																	//gnight boo