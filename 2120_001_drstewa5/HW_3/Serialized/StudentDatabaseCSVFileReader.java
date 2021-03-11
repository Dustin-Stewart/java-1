/**
*@author Dustin Stewart
*@version 1 03/14/18
*/

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
<code>public class StudentDatabaseCSVFileReader</code> 

builds a scanner called "input"

declares a method called <code>openFile</code> that takes a String called filename and passes it into 
"input" as a path. Scanner(Path T) Constructs a new Scanner that produces values scanned from the 
specified file. A path in java is just the reference to the directory path. In this case the scanner 
is scanning the data from the path where we have a CSV file.


*/

 public class StudentDatabaseCSVFileReader{

    private static Scanner input;

    public static void openFile (String filename) {

        try {
            input = new Scanner(Paths.get(filename));
        }   
        catch (IOException e) {
            System.err.println("Error opening file.  Terminating");
            System.exit(1);
        }        
    }    
/**
<code>public static StudentDatabase readData()</> 

builds a new StudentDatabase called db

then is declares an int called numlines and sets it to 0.

a while loop is implemented and while ths scanner is showing that there is another value after the current
token it stays true. 

it sets a String called "line" to be the value of each line in the file by calling the Scanner method nextLine. 
This jumps the scanner (which is reading from a CSV file with many lines of student data) from one line to the 
next, returning the data from each line that it jumps in order. each time it reads in a line it adds it to "line".

after that it increments numlines, keeping track of the amount of lines that get read in.

Then an array of strings gets built called fields. Fields is assigned to the String "line", only this time line 
is calling its split() method. A String of a comma gets passed into Split() indicating that it should split each 
token(word) between a comma into different String. All of thise new strings get passed into fields as different 
elements.

if there is more than one line stored in numLines, it calls 
<code>private static void parseDataFromCSVFile(String[] fields,StudentDatabase db)</code>, a method defined in 
the class.

finally it returns the database, now parsed, and sorted.
*/
    public static StudentDatabase readData() {
        StudentDatabase db = new StudentDatabase();
        int numLines = 0;
        while (input.hasNext()) {
            String line = input.nextLine();
            numLines++;
            String[] fields = line.split(","); // CSV file so split on commas.  (name contains a comma, so beware)
 //           System.out.println(fields.length);
            if (numLines != 1)
                parseDataFromCSVFile(fields,db);
        }                    
        return db;
    }
/**
<code>private static void parseDataFromCSVFile(String[] fields,StudentDatabase db)</code> is the parsing and
sorting portion. It takes in our String[] fields and our student database "db" first, Then it builds a new Student 
type object called "ts".

To get the primitive int value from the first index of "fields", we use Integer.parseInt(fields[0]). This gets the
primitive int value from the string we converted the student id into to put it into "fields". then we call the 
setStudentID() method to set id the the student "ts"'s Id. We continue to assign the values from fields into the 
respected fields in the students object until the student ts is built. Once the student has had all of its values
assigned, The database "db" uses its add() method to add that student to itself.
*/
    private static void parseDataFromCSVFile(String[] fields,StudentDatabase db) {
        Student ts = new Student();
        // parse and set student ID
        int id = Integer.parseInt(fields[0]);
        ts.setStudentID(id);
        // parse and set sex
        ts.setSex(fields[1]);
        // parse and set Ethnic Group
        ts.setEthnicGroup(fields[2]);
        // parse and set name - the name is first, last in fields at indices 3 and 4
        // also we need to get rid of double quotes
        StringBuilder lastName =  new StringBuilder(fields[3]);
        lastName.deleteCharAt(0);
        //System.out.println(lastName);
        StringBuilder firstName = new StringBuilder(fields[4]);
        firstName.deleteCharAt(fields[4].length()-1);
        //System.out.println(firstName);
        firstName.append(" ");
        firstName.append(lastName);
        //System.out.println(firstName);
        ts.setName(firstName.toString());
        // set primary program
        ts.setProgram(fields[5]);
        // set academic plan
        ts.setAcademicPlan(fields[6]);
        // set subplan
        ts.setSubPlan(fields[7]);
        // set start level
        int sl = Integer.parseInt(fields[8]);
        ts.setStrtLevel(sl);
        // set "total" ?
        double tot = Double.parseDouble(fields[9]);
        ts.setTotal(tot);
        // set GPA
        double gpa = Double.parseDouble(fields[10]);
        ts.setGPA(gpa);
        // set FAFSA (on file?)
        ts.setFAFSA(fields[11]);
        double takePrgrs = Double.parseDouble(fields[12]);
        ts.setTakePrgrs(takePrgrs);
        //add student to the database
        double need = Double.parseDouble(fields[13]);
        ts.setFinancialNeed(need); 
        db.add(ts);
    }
/**
<code>public static void closeFile()</code> is a method of this class that checks to see
if there the token in the Scanner "input" is null. If not then it calls the close() method
which closes the file it was reading.
*/
    public static void closeFile() {
        if (input != null)
            input.close();
        input = null;
    }

}
