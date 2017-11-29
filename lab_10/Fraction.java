/**
 * A class to model a fraction. Methods include add, 
 * subtract, multiply, divide, toString, and the 
 * appropriate getters and setters.
 *
 * @author	Franklin D. Worrell
 * @version	19 July 2016
 */ 
public class Fraction {
	private int numerator; 
	private int denominator; 
	
	/**
	 * Constructor initializes instance variables to
	 * values passed as arguments. 
	 * 
	 * @param	numerator	the new Fraction's numerator
	 * @param	denominator	the new Fraction's denominator
	 */ 
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator; 
		this.denominator = denominator; 
	} // end constructor
	
	
	/** 
	 * Returns this Fraction's numerator.
	 *
	 * @return 	this.numerator
	 */ 
	public int getNumerator() {
		return this.numerator; 
	} // end method getNumerator
	
	
	/**
	 * Returns this Fraction's denominator. 
	 * 
	 * @return 	this.denominator
	 */ 
	public int getDenominator() {
		return this.denominator; 
	} // end method getDenominator
	
	
	/**
	 * Adds the Fraction passed as an argument to this
	 * Fraction instance and returns the sum as new
	 * Fraction. 
	 *
	 * @param	otherFraction	the Fraction being add to this
	 * @return	the sum of the two Fractions
	 */ 
	public Fraction add(Fraction otherFraction) {
		int commonDenom = this.denominator * otherFraction.getDenominator(); 
		int firstNum = this.numerator * otherFraction.getDenominator(); 
		int secondNum = otherFraction.getNumerator() * this.denominator; 
		int sumNum = firstNum + secondNum; 
		return new Fraction(sumNum, commonDenom); 
	} // end method add
	
	
	/**
	 * Subtracts a Fraction taken as an argument from
	 * this Fraction instance and returns a new Fraction
	 * that is the difference of the two. 
	 *
	 * @param	otherFraction	the Fraction being subtracted from this
	 * @return	the difference of the Fractions
	 */ 
	public Fraction subtract(Fraction otherFraction) {
		int commonDenom = this.denominator * otherFraction.getDenominator(); 
		int firstNum = this.numerator * otherFraction.getDenominator(); 
		int secondNum = otherFraction.getNumerator() * this.denominator; 
		int sumNum = firstNum - secondNum; 
		return new Fraction(sumNum, commonDenom); 		
	} // end method subtract 
	
	
	/**
	 * Multiplies the Fraction passed as an argument 
	 * with this Fraction instance. Returns the product
	 * as a new Fraction.
	 * 
	 * @param	otherFraction	the Fraction being multiplied with this
	 * @return	the product of the two Fractions
	 */ 
	public Fraction multiply(Fraction otherFraction) {
		int prodNum = this.numerator * otherFraction.getNumerator(); 
		int prodDen = this.denominator * otherFraction.getDenominator(); 
		return new Fraction(prodNum, prodDen); 
	} // end method multiply 
	
	
	/**
	 * Divides this Fraction instance by the Fraction
	 * passed as an argument. Returns the quotient as 
	 * a new Fraction.
	 *
	 * @param	otherFraction	the divisor Fraction
	 * @return	the quotient
	 */ 
	public Fraction divide(Fraction otherFraction)throws IllegalArgumentException {
		if (otherFraction.getNumerator() == 0){
         throw new IllegalArgumentException("UNDEFINED");
      }
      // Create inverse of divisor. 
      else{
      	int inverseNum = otherFraction.getDenominator(); 
      	int inverseDen = otherFraction.getNumerator(); 
      	Fraction inverse = new Fraction(inverseNum, inverseDen); 
      	// Multiply dividend by inverse of divisor. 
      	return this.multiply(inverse);
      } 
	} // end method divide
	
	
	/**
	 * Returns a String representation of this Fraction
	 * instance. 
	 * 
	 * @return	a String representation of this Fraction
	 */ 
	@Override
	public String toString() {
		return this.numerator + " / " + this.denominator; 
	} // end method toString
} // end class Fraction