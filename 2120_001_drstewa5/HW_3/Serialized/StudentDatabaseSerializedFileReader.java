/**
*@author Dustin Stewart
*@version 1 03/14/18
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.util.ArrayList; 
/**
<code>public class  StudentDatabaseSerializedFileReader</code> initializes a new object 
input stream called deserializationinput to null, and builds a student database which it 
calls sDB.
*/
public class  StudentDatabaseSerializedFileReader{
	public static ObjectInputStream deSerializationInput = null;
	public static StudentDatabase sDB;
/**
The first method in this class is one that opens a new objectInputStream. It first takes 
in a String called inputFile. This value would be passed from the main method from class
ReadSortAndSerializeStudentDatabase as the first argumment in the command line or to be 
specific, the file that we are attempting to serialize. It takes in the file and converts
it to an objectinputstream.
*/ 
	public static void openInputStream(String inputfile) {
		try{
			deSerializationInput = new ObjectInputStream(new FileInputStream(inputfile));
			}

			catch(FileNotFoundException e){
				System.err.println("Error opening save file for reading.");
			}

			catch(IOException e) {
				System.err.println("Error writing stream header from write file.");
			}

	} // end method openInputStream
	
/**
the readObjects() method reads the value of the objectStream deSerializationInput, and assigns 
its values to a student database, which it then returns.
 */ 
	public static StudentDatabase readObjects() {
		
		try{
				sDB = (StudentDatabase) deSerializationInput.readObject();

		}

		catch(EOFException e){
			System.out.println("Finished reading from save file.");

		}

		catch(ClassNotFoundException e){
			System.err.println("Contents of save file were corrupted.");
		}

		catch(IOException e)  {
			System.err.println("Error reading from save file.");
			e.printStackTrace();
		}
		return sDB;

	} // end method readObjects
	
	
/**
the closeInputStream() method closes the objectinputstream file. 
*/ 
	public static void closeInputStream() {
			try{
		deSerializationInput.close();
	}

		catch(IOException e){
			System.err.println("Error closing save file after reading.");
			e.printStackTrace();
			System.exit(1);
		}
	} // end method closeInputStream
} // end class Calendar
