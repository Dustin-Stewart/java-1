//lab example 1 bouncer.java
//dustin stewart,8/30
import java.util.Scanner;
public class Bouncer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int numberInLine;
			System.out.println("How many people are in line?");
			numberInLine = input.nextInt();
			while (numberInLine > 0){
				int age;
				System.out.println("how old are you?");
				age = input.nextInt();
				if (age < 18) {
					System.out.println("get TF out of here");
				}
				else if (age >= 18 && age < 21) {
					System.out.println("you can come in, but no drinks");
				}
				else {
					System.out.println("welcome home");
				}
			
		System.out.println("Nonetheless, have a great night!");
		numberInLine--;
}
}
}