/**
@AUTHOR DUSTIN STEWART
@VERSION 1
@SINCE FEB. 7 2018

*PUBLIC CLASS COMPLEX NUMBER PERFORMS A SERIOUS OF ARITHMETIC ACTIONS ON COMPLEX NUMBERS.
*/
public class ComplexNumber {
    /**PRIVATE FLOATS A & B HOLD THE VALUES OF TWO FLOATING POINT NUMBERS, EACH REPRESENTING A VARIABLE IN THE EQUATION A+Bi (A COMPLEX NUMBER)
    */
    private float a;
    private float b;
    /**THE CONSTRUCTOR COMBINES THE TWO NUMBERS INTO AN OBJECT CALLED COMPLEXNUMBER BY ASSIGNING TWO FLOATS TO VALUES A & B 
    @PARAM REQUIRES TWO FLOATING POINT NUMBERS
    */
    public ComplexNumber(float a, float b){
        this.a = a;
        this.b = b;
    }
    /**GETTER METHODS FOR RETRIEVING EXACT VALUES OF THE COMPONENTS OF A COMPLEX NUMBER. RETURNS EITHER A OR B RESPECTIVELY
    */
    public float getA(){
        return this.a;
    }

    public float getB(){
        return this.b;
    }
    /**THE ADD METHOD [.ADD()] TAKES IN A COMPLEX NUMBER AND ADDS IT TO ANOTHER, RETURNING THE RESULT. IT BUILDS A NEW COMPLEX NUMBER NAMED NEW COMPLEX AND 
       ASSIGNS THE RESULT OF THE ARITHMETIC TO THAT VALUE BEFORE RETURNING THAT VALUE. THE ARITHMETIC IS PERFORMED BY INITIALIZING TWO NEW FLOATS 
       AND BUILDING "NEW COMPLEX" OUT OF THE COMPONENTS.
    @PARAM PROVIDE A COMPLEX NUMBER
    */
    public ComplexNumber add(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = (a + otherNumber.getA());
        float newB = (b + otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    /**THE SUBTRACT METHOD [.SUB()] USES THE SAME IMPLEMENTATION AS [.ADD] WITH SUBTRACTION INSTEAD OF ADDITION.
    @PARAM CPROVIDE A COMPLEX NUMBER 
    */
    public ComplexNumber sub(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = (a - otherNumber.getA());
        float newB = (b - otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    /**THE MULTIPLICATION METHOD [.MULT]ALSO USES THE SAME IMPLEMENTATION, HOWEVER THERE ARE CHANGES TO THE ARITHMETIC TO ACCOUNT FOR MULTIPLICATION
       OF COMPLEX NUMBERS.
    @PARAM PROVIDE A COMPLEX NUMBER
    */
    public ComplexNumber mult(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        float newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    /**AGAIN WE SEE THE SAME IMPLEMENTATION, WITH DIFFERENT ARITHETIC WHICH MODELS DIVISION OF COMPLEX NUMBERS.
    @PARAM PROVIDE A COMPLEX NUMBER
    */
    public ComplexNumber div(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) /
                     ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB()* otherNumber.getB()));
       
        float newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) /
                     ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB()* otherNumber.getB()));
        
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
    /**THE EQUALS METHOD IS A PROPERTY OF THE CLASS OBJECT WHICH IS AN OVERRIDE. WE OVERRIDE THIS SO THAT WE CAN STRICTLY COMPARE TWO COMPLEX NUMBERS, AS THE
    METHOD FOR EQUALS WILL COMPARE ANY TWO OBJECTS. TO ACHEIVE THIS WE TAKE IN AN OBJECT, WHICH WE THEN CAST AS A COMPLEX NUMBER TO PERFORM THE ACTION. THAT
    ACTION BEING THE COMPARISON OF TWO COMPLEX NUMBERS CONTAINING PARTS "A" & "B".
    @PARAM PROVIDE A COMPLEX NUMBER
    */
    @Override
    public boolean equals(Object other){
      ComplexNumber num = (ComplexNumber)other;
      if (!(num instanceof ComplexNumber))
         return false;
      if (!(num.getA() == this.a))
         return false;
      if (!(num.getB() == this.b))
         return false;
      else
         return true;
    }
    /**THE TOSTRING METHOD HERE IS A COMMON OVERRIDE. IN THIS CASE IT IS BEING OVERRIDDEN TO PROVIDE A MORE ACURRATE STATE OF THE
    COMPLEX NUMBER. IT USES ONLY A FEW LOGIC AND CONDITIONAL OPERATORS TO CLEAN UP ITS RESULTS.
    */
    @Override
    public String toString(){
       
        if (this.b == 0){
         String zero = " " + this.a;
         return zero;
        }
        if (this.b < 0){
         String negative = this.a + " + " + this.b + "i";
         return negative;
        }
        else{
         String positive = this.a + " + " + this.b + "i";
         return positive;
      }
   }
} /**END CLASS
*/