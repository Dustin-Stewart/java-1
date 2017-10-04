import java.util.Scanner;

public class excerciseTwo{
	public static void main(String[] args){
		
		String[] lookUpTable = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001"};
		
		Scanner input =new Scanner(System.in);
		int numberGiven;
		do{
			System.out.println("Enter a number from 0-9");
			numberGiven = input.nextInt();
			
			if (numberGiven<=9 && numberGiven>=0){
				String binaryVersion = lookUpTable[numberGiven];
				System.out.println("The number"+ numberGiven +" is "+ binaryVersion +" in binary.");		
			}
		} 
		while (numberGiven <=9 && numberGiven>=0);
	}//end main
}//end class