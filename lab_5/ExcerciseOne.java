/*
Excercise one 
Dustin Stewart	
10/2/17
*/
import java.util.Random;

public class ExcerciseOne{
	public static void main(String[] args){
		Random intGenerator = new Random();
		
		int[] randomIntArray = new int[10];
		for (int index=0; index< randomIntArray.length; index++){
			randomIntArray[index] = intGenerator.nextInt();
		}
		for (int index=0; index< randomIntArray.length; index++){
			System.out.println(randomIntArray[index]);
			}			
		
		
		//second part
		String[] months = {"jan","feb","mar","may,","apr","jun","jul","aug","sept","oct","nov","dec"};
		int myMonth = intGenerator.nextInt(12);
		
		System.out.println(months[myMonth]);
	}
}