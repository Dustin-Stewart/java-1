/**
*@author Dustin Stewart
*@version 1 03/14/18
*/
import java.util.*;
import java.io.*;
/**
<code>public class ReadSortAndSerializeStudentDatabase</code>takes two command line arguments
and declares them infilename and outfilename. infilename is the name of the serialized 
file we take in and outfilename will be the name of the CSV file we write out to.
*/
public class ReadSortAndSerializeStudentDatabase{
	public static StudentDatabase sDB;

		    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: BuildAndSortStudentDataFromCSVFile inputfilename outputfilename");
            System.exit(1);
        }

        String outfilename = args[1];
		String infilename = args[0];
/**
we open an inputstream from StudentDatabaseSerializedFileReader and we pass in our serialized
file. we then read it in as a database and close the file stream.
*/
		StudentDatabaseSerializedFileReader.openInputStream(infilename);
		sDB = StudentDatabaseSerializedFileReader.readObjects();
		StudentDatabaseSerializedFileReader.closeInputStream();
/**
on line 32 the database is sorted by GPA
*/
		sDB.sortByGPA();
/**
on line 38 we open the outfile with StudentDatabaseCSVFileWriter. then on the
next line we write the database we just made into a csv file, then we close the stream.
*/
	    StudentDatabaseCSVFileWriter.openFile(outfilename);
        StudentDatabaseCSVFileWriter.writeData(sDB);
        StudentDatabaseCSVFileWriter.closeFile();
         
	}
}