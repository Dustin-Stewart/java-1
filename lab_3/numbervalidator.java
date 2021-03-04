//dustin stewart 9.13
//number validator

import java.util.Scanner;

public class numbervalidator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		int interger;
		
		System.out.println("Enter a number between zero and ten");
		interger = input.nextInt();
		
		if ((interger > 0) && (interger <10)) {
			System.out.println("valid number");
		}
			
			else {
				System.out.println("Invalid number");
			}
					
		System.out.println("Enter a number divisible by 2 or 3");
		interger = input.nextInt();
		
		if (((interger %2) ==0) || ((interger %3)==0)){
			System.out.println("Valid number");
		}
			
			else {
				System.out.println("invalid number");
			}
			
		System.out.println("Enter a number that is negative and even or positive and odd"); //enter a number that is 
		interger = input.nextInt();
		
		if (((interger <0)&&((interger %2)==0)) || ((interger>0) &&((interger %2)==1))){
				
			System.out.println("Valid number");	
		}
		
			else {
				System.out.println("Invalid number");
			}
			
		System.out.println("Enter a numbe r that is divisible by either 5 or 2, but not both");
			interger = input.nextInt();
			
		if ((((interger %2)==0) || ((interger %5)==0)) && !((interger % 10)==0)){
				System.out.println("valid number");
			}
			
			else {
				System.out.println("invalid number");
			}
					
		System.out.println("enter a positive odd number");
			interger = input.nextInt();
		
		if (!((interger %2)==0) && !(interger <=0)){
			System.out.println("Valid number");
			}
			
			else {
				System.out.println("invalid number");
			}
	}// end main
}//end class
	