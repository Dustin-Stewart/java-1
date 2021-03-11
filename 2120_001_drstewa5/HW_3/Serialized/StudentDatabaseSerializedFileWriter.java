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
<code>public class StudentDatabaseSerializedFileWriter</code> initializes a new object 
Output stream called deserializationOutput to null, and builds a student database which it 
calls sDB.
*/
public class StudentDatabaseSerializedFileWriter{
		public static ObjectOutputStream serializationOutput = null;
		public static StudentDatabase sDB;
/**
The first method in this class is one that opens a new objectOutputStream. It first takes 
in a String called outFile. This value would be passed from the main method from class
BuildSortAndSerializeStudentDatabase as the second argumment in the command line. It takes 
in the file and converts it to an objectoutputstream.
*/ 
	public static void openOutputStream(String outfile) {
		try{
			serializationOutput = new ObjectOutputStream(new FileOutputStream(outfile));
			}

			catch(FileNotFoundException e){
				System.err.println("Error opening save file for writing.");
			}

			catch(IOException e) {
				System.err.println("Error writing stream header for write file.");
			}

	} // end method openOutputStream 
	
	
/**
the writeObjects() method takes in a student database called db. It passes the 
studentdatabase to the objectOutputStream method writes the database to the 
objectOutputStream.
*/ 
	public static void writeObjects(StudentDatabase DB ) {
		
		try{
			serializationOutput.writeObject(DB);

		}

		catch (NullPointerException e){
			System.err.println("Save file was not previously opened for writing.");
			System.err.println("Reinitializing...");
		}

		catch(IOException e){
			System.err.println("Error writing to save file.");
				e.printStackTrace();
		}
	} // end method writeObjects 
	
	
/**
the closeOutputStream() method closes the ObjectOutputStream.
*/ 
	public static void closeOutputStream() {
		try{
			serializationOutput.close();
		}

		catch(IOException e){
			System.err.println("Error closing save file after writing.");
			e.printStackTrace();
			System.exit(1);
		}
	} // end method closeOutputStream

}