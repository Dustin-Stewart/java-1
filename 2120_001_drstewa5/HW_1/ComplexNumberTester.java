/**
@AUTHOR DUSTIN STEWART
@VERSION 1
@SINCE 02/07/18 
   THIS CLASS IS A TESTER CLASS FOR THE COMPLEXNUMBER CLASS. IT PROVIDES VALUES TO THE METHODS IN THE COMPLEXNUMBER CLASS AND TESTS FOR ACCURACY.
   THE VALUES HEREIN ARE VERIFIED BY WOLFRAM ALPHA.
*/

/**HERE IS WHERE THE JUNIT TESTING MATERIAL GETS IMPORTED INTO THE CLASS. WE IMPORT BOTH THE JUNIT PACKAGE AND THE ASSERT FUNCTION
   FOR TESTING PURPOSES
*/
import static org.junit.Assert.*;
import org.junit.*;
/** CLASS SIGNATURE IS HERE, AND BENEATH IT ARE PRIVATE OBJECTS OF TYPE COMPLEX NUMBER. THESE OBJECTS WILL BE THE TESTING VALUES PASSED INTO
    THE COMPLEXNUMBER CALCULATOR'S METHODS. 
*/
public class ComplexNumberTester {
   private ComplexNumber a;
   private ComplexNumber b;
   private ComplexNumber c;
   private ComplexNumber d;
   private ComplexNumber e;
   private ComplexNumber f;
/**THE BEFORE TAG IS USED HERE TO ENSURE THAT THESE OBJECTS ARE INSTANTIATED BEFORE ANY TESTS ARE RUN. THE VALUES ARE WHOLE NUMBER INTERGERS
   AND THE LAST TWO VALUES ARE EQUAL FOR TESTING THE EQUALITY METHOD BELOW
*/
@Before
   public void setup(){
   a = new ComplexNumber(4,3);
   b = new ComplexNumber(2,-1);
   c = new ComplexNumber(8,11);
   d = new ComplexNumber(-14,7);
   e = new ComplexNumber(215,-177);
   f = new ComplexNumber(215,-177);
   }
/**A TEST OF THE ADD FUNCTION. AN OBJECT OF TYPE COMPLEXNUMBER IS CREATED AND NAMED SUM. ITS GETS ITS VALUES BY PASSING IN THE VALUES CREATED
   ABOVE INTO THE [.ADD] METHOD. THE ASSERTEQUALS METHOD DETERMINES WETHER OR NOT THE PREDICTED VALUES OBTAINED FROM WOLFRAM ALPHA WILL MATCH THE 
   ACTUAL VALUES OBTAINED THROUGH THE ARITHMETIC METHODS. THE TEST IS RUN THREE TIMES WITH THREE DIFFERENT SETS OF COMPLEXNUMBERS.
   @PARAM ASSERTEQUALS FOR ASSERT EQUALS PASS IN ([THE EXPECTED VALUE], [THE ACTUAL VALUE OBTAINED THROUGH THE METHOD], [THE MARGIN OF ERROR IN DECOIMAL FORM]). 
*/
@Test
public void testAdd(){
   ComplexNumber sum = a.add(b);
   assertEquals(6,sum.getA(),.00001);
   assertEquals(2,sum.getB(),.00001);
   
   sum = a.add(a);
   assertEquals(8,sum.getA(),.00001);
   assertEquals(6,sum.getB(),.00001); 
   
   sum = c.add(d);
   assertEquals(-6,sum.getA(),.00001);  
   assertEquals(18,sum.getB(),.00001);
   }   
/**THIS IS A TEST OF THE SUBTRACTION METHOD IT FUNCTIONS IDENTICALLY TO THE ADDITION METHOD WITH DIFFERENCES IN OPERATION METHOD ( @SEE [SUB] ) AND 
   VALUES PASSED.
*/   
@Test
public void testSubtract(){
   ComplexNumber diff = a.sub(b);
   assertEquals(2,diff.getA(),.00001);
   assertEquals(4,diff.getB(),.00001);
   
   diff = b.sub(b);
   assertEquals(0,diff.getA(),.00001);
   assertEquals(0,diff.getB(),.00001);
   
   diff = c.sub(a);
   assertEquals(4,diff.getA(),.00001);
   assertEquals(8,diff.getB(),.00001);
}   
/** THIS IS THE TEST FOR THE MULTIPLICATION ( @SEE MULT ) TEST. ITS FUNCTIONS ARE IDENTICAL TO THE FORMER TWO AS WELL AS THE DIVISION TEST.
*/
@Test
public void testMult(){
   ComplexNumber mult = a.mult(b);
   assertEquals(11,mult.getA(),.00001);
   assertEquals(2,mult.getB(),.00001);
   
   mult = c.mult(d);
   assertEquals(-189,mult.getA(),.00001);
   assertEquals(-98,mult.getB(),.00001);
   
   mult = a.mult(c);
   assertEquals(-1,mult.getA(),.00001);
   assertEquals(68,mult.getB(),.00001);   
}

/**THIS IS THE DIVISION TEST, WITH IDENTICAL STRUCTURE TO THE FIRST THREE TESTS.
*/
@Test
public void testDivide(){
   ComplexNumber quotient = a.div(b);
   assertEquals(1,quotient.getA(),.00001);
   assertEquals(2,quotient.getB(),.00001);
   
   quotient = c.div(b);
   assertEquals(1,quotient.getA(),.00001);
   assertEquals(6,quotient.getB(),.00001);   
   
   quotient = d.div(a);
   assertEquals(-1.4f,quotient.getA(),.00001);
   assertEquals(2.8f,quotient.getB(),.00001);      
}
/**THIS IS THE TEST FOR THE EQUALS FUNCTION. TWO VALUES ARE PASSED INTO IT AND THE ASSERT EQUALS TEST PASSES IF THEY ARE EQUAL. THE VALUES ARE SET
   EQUALLY TO ENSURE A PASSING TEST
*/
@Test
public void testEquals(){
   assertEquals(e,f);
}
}