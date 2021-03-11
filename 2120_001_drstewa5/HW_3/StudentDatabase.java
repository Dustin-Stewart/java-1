/**
*@author Dustin Stewart
*@version 1 03/14/18
*/
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.io.Serializable;
/**
<code>public class StudentDatabase</code> is a database style class which provides
some methods for which to manipulate a database with.This is a serializable class
which means we can  store a copy of the object, the maybe send them it to another 
process on the same system or over the network. basically, serielizing objects is 
a way of taking an object and making it into a smaller array of machine code, which
contains the built objects and is more portable and able to be manipulated in a way that 
only a serialized file can be. I have seen it referred to as being like the teleporter
from "star trek" or "the fly" which breaks up a whole object into bytes then can 
reprodue that object later or even on another system. 
*/
public class StudentDatabase implements Serializable{
/**
First it initiializes a private arrayList of student objects called "theData". It then 
implements a public constructor that builds the ArrayList. Afterwards the class goes on 
to define varios methods required by a database such as adding new students with add(),
getting the number of students, getting the index ofa student by means of searching student
id's, and returning the value of a student.
*/
    private ArrayList<Student> theData;

    public StudentDatabase() {

        theData = new ArrayList<Student>();
    }

    public void add(Student s) {
        theData.add(s);

    }

    public int getNumStudents() {
        return theData.size();
    }

    public int getIndexOfStudentWithID(int studentID) {
        for (int i=0; i< theData.size(); i++) {
            if (theData.get(i).getStudentID() == studentID)
                return i;
        }
        return -1;
    } 

    public Student getStudent(int index) {
        return theData.get(index);
    }
/**
this is a specific method called sortByGPA, wihch calls the sort() method from Collections. 
it uses a comparator to compare the GPAs of student and sort them in order from least to 
greatest.  
*/
    public void sortByGPA() {
        Collections.sort(theData, 
                        new Comparator<Student>() {
                            public int compare(Student s1, Student s2) {
                                if (s1.getGPA() > s2.getGPA())
                                    return -1;
                                else if (s1.getGPA() < s2.getGPA())
                                    return 1;
                                return 0;
                            }
                        } );
    }

    public ArrayList<Student> getData() {
        return theData;
    }

    public String toString() {
        StringBuilder returnVal = new StringBuilder();
        for (Student s : theData) {
            returnVal.append(s.toString());
            returnVal.append("\n");
        }
        return returnVal.toString();
    }

}
