public class ComplexNumber {

    private float a;
    private float b;

    public ComplexNumber(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float getA(){
        return this.a;
    }

    public float getB(){
        return this.b;
    }

    public ComplexNumber add(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = (a + otherNumber.getA());
        float newB = (b + otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    public ComplexNumber sub(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = (a - otherNumber.getA());
        float newB = (b - otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    public ComplexNumber mult(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = (getA() * otherNumber.getA()) - (getB() * otherNumber.getB());
        float newB = (getB() * otherNumber.getA()) + (getA() * otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    public ComplexNumber div(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newA = (((getA() * otherNumber.getA()) + (getB() * otherNumber.getB())) /
                     (otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB()* otherNumber.getB()));
       
        float newB = (((getB() * otherNumber.getA()) - (getA() * otherNumber.getB())) /
                     (otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB()* otherNumber.getB()));
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    public boolean equals(ComplexNumber otherNumber) {
        return this.a == otherNumber.getA() && this.b == otherNumber.getB();
    }
    
    @Override
    public boolean equals(Object other){
      CoplexNumber num = (ComplexNumber)other;
      if (!(num instanceof ComplexNumber))
         return false;
      if (!(num.getA() == this.a))
         return false;
      if (!(num.getB() == this.b))
         return false;
      else
         return true;
    }

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
        }
        return complexString;
    }
}
