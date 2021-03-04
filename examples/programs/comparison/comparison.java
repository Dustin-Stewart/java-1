//fig 2.15: Comparison.java
/*compare intergers using if statements,relational operators
  and equality operators*/
  import java.util.Scanner;  //import the scanner/util you need
	
public class Comparison {
	
	public static void main(String[] args) {   //main method declared
		
		Scanner input = new Scanner(System.in); //initializes the scanner to recieve input from the keyboard
			
			System.out.print("first number here: "); //interfaces the user, requests input
				int num1 = input.nextInt();			 //sets the input provided by the user to equal num1
				
			System.out.print("second number here: ");
				int num2 = input.nextInt();			 //sets the next input by the user to wqual num2
				
					if (num1 == num2) { 		 //codeblock/conditional statement (if num1 is equal to num 2)
						System.out.printf("%d == %d%n", num1, num2);		//compares the numbers and prints them in format (x is equal to y new line, then states x, y)
						}
					if (num1 != num2) {
						System.out.printf(%d != %d%n", num1, num2);
						}
					if (num1 < num2) {
						System.out.printf(%d < %d%n", num1, num2);	
						}
					if (num1 > num2) {
						System.out.printf(%d > %d%n", num1, num2);
						}
					if (num1 <= num2) {
						System.out.printf(%d <= %d%n", num1, num2);	
						}
					if (num1 >= num2) {
						System.out.printf(%d >= %d%n", num1, num2);
						}
	}   //end main method		
	
}//end class comparison	