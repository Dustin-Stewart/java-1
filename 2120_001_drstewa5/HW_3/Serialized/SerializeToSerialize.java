/**
*@author Dustin Stewart
*@version 1 03/14/18
*/
import java.util.*;
import java.io.*;
/**
<code>public class SerializeToSerialize</code> takes two command line arguments
and declares them infilename and outfilename. infilename is the name of the serialized 
file we take in and outfilename will be the name of the serialized file we write out to.

*/
public class SerializeToSerialize {
    public static StudentDatabase sDB;
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: SerializeToSerialize inputfilename outputfilename");
            System.exit(1);
        }

        String infilename = args[0];
        String outfilename = args[1];
/**
on line 26 we open an InputStream and pass the infile to it. It gets read into a 
database on the next line, and subsequently the inputstream is closed.
*/
        StudentDatabaseSerializedFileReader.openInputStream(infilename);
        sDB = StudentDatabaseSerializedFileReader.readObjects();
        StudentDatabaseSerializedFileReader.closeInputStream();
/**
on line 32 the database is sorted by GPA
*/
        sDB.sortByGPA();
/**
on line 38 we open an outputstream and pass in the outfile name. then on the
next line we write the database we just made into the output stream and immediatly
close it.
*/
        StudentDatabaseSerializedFileWriter.openOutputStream(outfilename);
        StudentDatabaseSerializedFileWriter.writeObjects(sDB);
        StudentDatabaseSerializedFileWriter.closeOutputStream();

    }
}