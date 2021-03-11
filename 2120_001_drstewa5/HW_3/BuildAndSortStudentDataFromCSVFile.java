/**
*@author Dustin Stewart
*@version 1 3/13
*/
import java.util.ArrayList;
/**
<code>public class BuildAndSortStudentDataFromCSVFile </code> holds our main method which runs our program. 
This program takes 2 arguments on the command line and checks for them on line 14. The two args are represented
 by "infile" and "outfile". The infile is the CSV file created by MakeRandomStudents(). The outfile will be the 
 newly built student data base. The purpose of this class is to open, read in a csv file, then close that file.

 first we open the file with openFile() passing in the name of the file from the command line. then we set the 
 data from that file as a parsed and organized database using readData(). We close the file, then take the new 
 database we just read in and sort it by GPA. We open the new blank file that was passed in to the command line
 as the second argument "outFileName", write in the newly sorted database, then we close that file.

*/
public class BuildAndSortStudentDataFromCSVFile {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: BuildAndSortStudentDataFromCSVFile inputfilename outputfilename");
            System.exit(1);
        }

        String infilename = args[0];
        String outfilename = args[1];

        StudentDatabaseCSVFileReader.openFile(infilename);
        StudentDatabase db = StudentDatabaseCSVFileReader.readData();
        StudentDatabaseCSVFileReader.closeFile();

        db.sortByGPA();

        StudentDatabaseCSVFileWriter.openFile(outfilename);
        StudentDatabaseCSVFileWriter.writeData(db);
        StudentDatabaseCSVFileWriter.closeFile();
         
    }
}
