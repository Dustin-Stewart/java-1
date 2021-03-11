import static org.junit.Assert.*;
import org.junit.*;
/**
@author Dustin Stewart
@version Spring 2018 (regraded assignment) 

A test class for class Recursion
*/
public class RecursionTest{
/**
Instance variables. Several String arrays and strings to perform a variety of tests on. 
*/
		String[] array; 
		String[] otherArray;
		String a;
		String b;
		String c;
/**
A setup method that initializes my variables.Array "array" tests for several cases including sorting by
alphabetical order and testing the case of identical strings in the same array. String[] "otherArray" 
tests the case of an empty array. String c tests the case of an empty string.
*/
@Before
	public void setup(){
		String[] array = {"dustin","chris","arthur","christie","chris","arthur","brent","aa"}; // aa comes first
		String[] otherArray = {};
		String a = ("andy");
		String b = ("amber");//comes first
		String c = ("");
	}
/**
A test for compareTo(). Compares the same string, 2 different strings in both orders, and a string and an empty
string.
*/
@Test
	public void testCompareTo(){
				
		Recursion.compareTo(a,a);
		assertEquals(0,0);

		Recursion.compareTo(a,b);
		assertEquals(1,1);

		Recursion.compareTo(b,a);
		assertEquals(-1,-1);

		Recursion.compareTo(a,c);
		assertEquals(-1,-1);
	}
/**
a test for findMinimum(). compares an array containing some identical elements and an empty array.
*/
@Test
	public void	testFindMinimum(){

		Recursion.findMinimum(array);
		assertEquals("aa",Recursion.findMinimum(array));

		Recursion.findMinimum(otherArray);
		assertEquals("There are no words for what you have done.","There are no words for what you have done.");
	}
}