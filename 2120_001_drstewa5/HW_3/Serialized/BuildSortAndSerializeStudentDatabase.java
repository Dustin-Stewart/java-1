/**
*@author Dustin Stewart
*@version 1 03/14/18
*/
import java.util.ArrayList;
/**
<code>public class BuildSortAndSerializeStudentDatabase</code> contains a main method that 
takes in two arguments from the command line. The first argument is a String called inFilename.
this will be the CSV file we are opening. We are going to read it into a database called sDB
and close the file.
*/
public class BuildSortAndSerializeStudentDatabase {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: BuildAndSortStudentDataFromCSVFile inputfilename outputfilename");
            System.exit(1);
        }

        String infilename = args[0];
        String outfilename = args[1];

        StudentDatabaseCSVFileReader.openFile(infilename);
        StudentDatabase sDB = StudentDatabaseCSVFileReader.readData();
        StudentDatabaseCSVFileReader.closeFile();
/**
After sDB gets written into a database object, it gets sorted by GPA.
*/
        sDB.sortByGPA();
/**
we then open an output stream and pass in the database. this stores it as a serialized file.
Afterwards we close the output stream.
*/
        StudentDatabaseSerializedFileWriter.openOutputStream(outfilename);
        StudentDatabaseSerializedFileWriter.writeObjects(sDB);
        StudentDatabaseSerializedFileWriter.closeOutputStream();
         
    }
}
