/**
@author Dustin Stewart
@version 2018 Spring (regraded assignment)

A class that holds two recursive methods which perform functions on strings.
The first is method compareTo() which compares two strings alphabetically. The second
is method findMinimum() which returns the first word in an array of strings.
*/

public class Recursion  {
/**
A private int that holds a value for the compareTo().It never gets called outside of the
method, but when I tried to implement it inside the method body it never initialized 
conditionally, just explicitly. As in if I set it to 0 it would just stay 0 and never
take another value. Still not sure what was going on with that, could you respond to this 
if you are the reader?
*/
	private static int val;
/**
{@link compareTo()} Returns an int determined by the comarison of two strings.
<p>
A recursive method that breaks a string's first char off and runs it against a
second string's first char. If the two characters are the same it takes a substring of
both strings remaining bodys and passes them back in.
<p>
If the first string passed in "comes first" then the method will return a negative one.
If the second string comes first then it returns a positive one.
<p>
Uses charAt to check the unicode value for each string, so interestingly enough
it is case sensitive. This code could've handled that but it was written hastily and late
and the author is quite ashamed.
<p>
Eventually one or the other strings will be first alphabetically, or one of the words will 
end resulting in the appropriate return. If it happens that both words are the same it returns 
0.
<p>
@param s1 the first string being compared
@param s2 the second string being compared
@return -1 if s1 comes before s2. 1 if s2 comes before s1. 0 if s1 and s2 are the same string
*/
	public static int compareTo(String s1, String s2){// takes in two strings to compare

		if (s1.isEmpty() && s2.isEmpty()){val = 0;}//check to see if they are empty, if so return 0

		else if (s1.isEmpty() && !s2.isEmpty()){val = 1;}

		else if (!s1.isEmpty() && s2.isEmpty()){val = -1;}

		else if (s1.charAt(0) < s2.charAt(0)){val = -1;}//if the first letter of the first word comes before that of the second return -1
		
		else if (s1.charAt(0) > s2.charAt(0)){val = 1;}//if the first letter of the second word comes before that of the first return 1

		else if (s1.charAt(0) == s2.charAt(0)){//if the first charactors match:

			if (s1.isEmpty()){ val = -1;}//check to see if either word ends, return the word that ends first
			
			else if (s2.isEmpty()){val = 1;}

			else compareTo(s1.substring(1) , s2.substring(1));}	//if neither word ends, compare the rest of the String recursively
					
		return val;//returns the value of the expression

	}//end of method compareTo
/**
A method that returns the first string alphabetically in a string array.
<p>
It holds a string value for minimum, then it checks to see if there are actually strings in
the array. If not it retruns a condescending string which is incidentally literal and true 
(no pun intended). If there are elements in the string array being analyzed then it packs the
array, its length, an index at 0, and an initial element said to be the minimum into in a big suitcase
and sends it to a very helpful method: {@link helper()}.

@param String[]
@return the alphabetical first in that array
*/
	public static String findMinimum(String[] array){//takes in an array and an int for the number of strings (length)
		
		String minimum;

		if (array.length == 0) //if there are no values in the array then it will let you know

			{String empty = ("There are no words for what you have done."); return empty;}

		else 

		minimum = helper(array, array.length, 0, array[0]); // call to the recursive method that supplies us with the answer. assumes the first word in the array is the first alphabetically
			
		return minimum;	//returns the first string alphabetically in the array

	}
/**
A method that determines the alphabetical first in an array.
<p>
This method that really pulls its own weight, the helper() basically does everything that you would
expect @see findMinimum() to do. Realistically you could use one method with hella parameters, but
you'd be asking for a lot of input that we can surmise ourselves and we do in @see findMinimum(). 
We split it up like this so the client only needs to send in its array, and we determine indexes and
length internally because its just better to push stuff like that deep down inside ourselves. 
<p>
It uses the compareTo method by running the first string in the array by the minumum of the rest of
the array. The method assumes the first word in the array is the first in order and if it finds out 
you sent a one element array into it it sends it right back at you like a vindictive little mirror.
It finds the minumum of the rest recursively by incrementing the index and sending itself back the 
four arguments with the new index.
<p>
Eventually it gets to the end of the array by way of incrementation, and then returns the value at 
min.

@param String[]
@param an int that will be the length of the array
@param an int for the index to begin at
@param a String that represents the minimum at a given moment
@return The String that comes first alphabetically
*/

	public static String helper(String[] array, int length, int index, String min){ 

		if (index == length) //if you hit the end ofthe array (or if there is one one element in the array) via the index it returns what value is said to be the minimum at that point
			
			{return min;}

		else if (compareTo(min, array[index]) < 0 || compareTo(min, array[index]) == 0) //calls helper() with the same values but increments the index if the words are the same or if the minimum comes first

			{return helper(array, length, index +1, min);}

		else 

			min = array[index]; 
			
			return helper(array, length, index +1, min); 

	}//end helper method

}//end class