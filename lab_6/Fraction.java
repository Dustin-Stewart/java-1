/*Objects and classes
Dustin Stewart
10-25-17*/

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator,int denominator){ //constructor
		this.numerator = numerator;		//method body
		this.denominator = denominator;
	}//end constructor
	
	public Fraction add(Fraction otherFraction){
		int commonDenominator = this.denominator * otherFraction.denominator;
		int number1 = this.numerator * otherFraction.denominator;
		int number2 = otherFraction.numerator * this.denominator;
		int newNum =number1 + number2;
		return new Fraction(newNum, commonDenominator);
	}//end add
	
	public Fraction subtract(Fraction otherFraction){
		int commonDenominator = this.denominator * otherFraction.denominator;
		int number1 = this.numerator * otherFraction.denominator;
		int number2 = otherFraction.numerator * this.denominator;
		int newNum =number1 - number2;
		return new Fraction(newNum, commonDenominator);
	}//end subtract
	
	public Fraction multiply(Fraction otherFraction){
		int number1 = this.numerator * otherFraction.numerator;
		int number2 = this.denominator * otherFraction.denominator;
		return new Fraction(number1,number2);
	}//end multiply	
	
	public Fraction divide(Fraction otherFraction){
		int number1 = this.numerator * otherFraction.denominator;
		int number2 = this.denominator * otherFraction.numerator;	
		return new Fraction(number1,number2);
	}//end divide
	
	public String toString(){
		return this.numerator + "/" + this.denominator;
	}//end toString
	
}//end class 