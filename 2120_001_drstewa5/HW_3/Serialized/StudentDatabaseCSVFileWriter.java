/**
*@author Dustin Stewart
*@version 1 3/13
*/
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Formatter;
/**
<code>Public class StudentDatabaseCSVFilewriter</code> formats and writes a student database as a 
comma seperated value file. It declares a new Formatter object called "output", then defines
a method called <code>openFile</code>. 

*/
public class StudentDatabaseCSVFileWriter {

    private static Formatter output;
/**
<code>Public static void openFile</code>  takes in a String called filename, and inititializes the 
Formatter "output" with the passed in String. Formatter is an object defined in java.lang that assists in
formatting outputs such as csv files. Here It will be used to format a csv file into a database containing
data from class Student in a specific and organized way.
@param String filename
*/
    public static void openFile (String filename) {

        try {
            output = new Formatter(filename);
        }  
/**
IO exception is thrown here by convention, because apparently it can always be thrown in IO settings.
@throws IOException e
*/ 
        catch (IOException e) {
            System.err.println("Error opening file.  Terminating");
            System.exit(1);
        }        
    }    
/**
<code>public static void writeData</code> takes in an object of type StudentDatabse and calls it db.
It gets the number of students from the database via StudentDatabase method getNumStudents, and iterates through
the database at hand by declaring it as "current" and using a for loop. It uses the method <code>format</code>
to write a formatted string to this object's destination using the specified locale, format string, and arguments.
@param StudentDatabase db
*/
    public static void writeData(StudentDatabase db) {
        
        int numStudents = db.getNumStudents();
        
        for (int i=0; i<numStudents; i++) {
        
            Student current = db.getStudent(i);
/**
line 53 uses a method of class Formatter to break up the string for a students name into an array, assigning each segment 
of the name seperated by a " " to different indexes of that array. on line 56, we call those different elements independently
in order to produce the name format "last, first middle". 
*/          
            String[] name = current.getName().split(" ");
            output.format("%d,%s,%s,%s,%s,%s,%s,%d,%1f,%.16f,%s,%f,%f,",
                current.getStudentID(),current.getSex(),current.getEthnicGroup(),
                "\""+name[3]+ ", " +name[1]+" "+name[2]+"\"",current.getProgram(),current.getAcademicPlan(),
                current.getSubPlan(),current.getStrtLevel(),current.getTotal(),
                current.getGPA(),current.getFAFSA(),current.getTakePrgrs(),
                current.getFinancialNeed());


            // end the line that represents all the data for one student
            output.format("%n");
        }
    }
/**
<code>public static void closeFile()</code> closes the formatter.
*/
    public static void closeFile() {
        if (output != null)
            output.close();
        output = null;
    }

}
