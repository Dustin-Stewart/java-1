import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
/**
@author Dustin Stewart
@version 2/22/18
*/
/**
RedirectTester class is a tester class for the methods in my package. 
*/
public class RedirectTester {
/**
instance variables for the class. output represents a bytearrayoutputstream, and i build a few dogs
and dogWalkers to use during testing. I built 2 so that I could test some periphary functions (add, clear, etc)
*/	
	private ByteArrayOutputStream output = new ByteArrayOutputStream();
	private Dog dyll;
	private Dog twig;
	private DogWalker holly;
	private DogWalker dustin;
/**
this is tagged @before so it runs before each test. it initializes the objects i built above in a setup
method, this way I have objects to work with before each test. first it uses the set out method to set a 
new printstream as the output, and passes the ByteArrayOutputStream I built previously into the new printstream.
I also utilize the addObserver method to attatch some new observers to each dog.
*/	
@Before
	public void setup() {
		System.setOut(new PrintStream(output));
		dyll = new Dog("Dyll");
		twig = new Dog("Twig");
	    holly = new DogWalker("Holly");
	    dustin = new DogWalker("Dustin");
	    twig.addObserver(holly);
	    dyll.addObserver(dustin);
	    dyll.addObserver(holly);
	} // end @Before method

/**
This test tests wether the state of a dog has changed. It assumes that the state is false. Since the
Changd variable is initially false, if it returns true then it is indicative that the state has changed.
*/
@Test
	public void testHasChanged(){

		assertFalse(dyll.hasChanged());
	}
/**
This test tests the output of the observable class to the observer class. It calls the poop method and then
tests the expected String output against the exact output by taking a string of my own design and comparing it 
to the value of output's toString. This is performed again after adding more observers to ensure integrity.
*/
@Test
	public void testObservers(){
		
		dyll.poop();
		
		assertEquals("I'm pooping!!\r\nHey, Dustin has been notified that Dyll has pooped!\r\nHey, Holly has been notified that Dyll has pooped!\r\n", output.toString());
		
		output.reset();
		
		twig.poop();

		assertEquals("I'm pooping!!\r\nHey, Holly has been notified that Twig has pooped!\r\n", output.toString());
		output.reset();
		twig.addObserver(dustin);
		twig.poop();
		assertEquals("I'm pooping!!\r\nHey, Holly has been notified that Twig has pooped!\r\nHey, Dustin has been notified that Twig has pooped!\r\n", output.toString());
	}

@Test
	public void testGetName(){

		assertEquals("Dyll", dyll.getName());
	}

@Test
	public void testStdOut(){
		System.out.print("hello");
		assertEquals("hello", output.toString());
	}
/**
This block resets the streams to the Standard System.out.
*/
@After
	public void resetStreams() {
		System.setOut(System.out);
	} // end @After method

} // end class RedirectTester