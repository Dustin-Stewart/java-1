/*dustin stewart
runner for fraction class
10-25-17*/

public class Runner{
	public static void main(String[] args){
		Fraction frac1 = new Fraction(1,2);
		Fraction frac2 = new Fraction(3,4);
		
		System.out.println("Fraction 1: "+frac1.toString());
		System.out.println("Fraction 2: "+frac2.toString());
		
		Fraction sum = frac1.add(frac2);
		System.out.println("\nSum: "+sum);
		
		Fraction subtract = frac1.subtract(frac2);
		System.out.println("\nDifference: "+subtract);
		
		Fraction multiply = frac1.multiply(frac2);
		System.out.println("\nProduct: "+multiply);
		
		Fraction divide = frac1.divide(frac2);
		System.out.println("\nQuotient: "+divide);
	}
}