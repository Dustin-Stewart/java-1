/**
*@author Dustin Stewart
*@version 1 03/14/18
Class Student is a class that builds student objects. The student objects represent real 
students and have basic student info used for organizing students.(e.g. student id#, ethnicity, 
program of study, GPA, et cetera) It is important to note that like class StudentDatabase this 
is a serializable class meaning that the student objects that get built are serializable.
*/
import java.io.Serializable;

public class Student implements Serializable {
/**
These are the instance variables for a student.
*/
    private int studentID;
    private String sex;
    private String ethnicGroup;
    private String name;
    private String program;
    private String academicPlan;
    private String subPlan;
    private int    strtLevel;
    private double total;
    private double gpa;
    private String fafsa;
    private double takePrgrs;
    private double financialNeed;
/**
This is the student constructor. it takes no parameters and initializes each state
to zero or nothing.
*/
    public Student() {
        studentID = 0;
        sex = "";
        ethnicGroup = "";
        name = "";
        program = "";
        academicPlan = "";
        subPlan = "";
        strtLevel = 0;
        total = 0.0;
        gpa = 0.0;
        fafsa = "";
        takePrgrs = 0.0;
        financialNeed = 0.0;
    }
/**
The following methods are getter/setter methods that set the values for the different 
variables. The method before last is an override of .equals() that allows two student
objects to be compared by their student id numbers to see if two students are the
same. The last method is a toString method that prints out the ordered values of a 
student object.
*/
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return this.sex;
    }

    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    public String getEthnicGroup() {
        return this.ethnicGroup;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void  setProgram(String program) {
        this.program = program;
    }

    public String  getProgram() {
        return this.program;
    }
    
    public void setAcademicPlan(String academicPlan) {
        this.academicPlan = academicPlan;
    }

    public String getAcademicPlan() {
        return this.academicPlan;
    }

    public void setSubPlan(String subPlan) {
        this.subPlan = subPlan;
    }

    public String getSubPlan() {
        return this.subPlan;
    }

    public void setStrtLevel(int strtLevel) {
        this.strtLevel = strtLevel;
    }

    public int getStrtLevel() {
        return this.strtLevel;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.total;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return this.gpa;
    }

    public void setFAFSA(String fafsa) {
        this.fafsa = fafsa;
    }

    public String getFAFSA() {
        return this.fafsa;
    }

    public void setTakePrgrs(double takePrgrs) {
        this.takePrgrs = takePrgrs;
    }

    public double getTakePrgrs() {
        return this.takePrgrs;
    }

    public void setFinancialNeed(double financialNeed) {
        this.financialNeed = financialNeed;
    } 

    public double getFinancialNeed() {
        return this.financialNeed;
    } 

    @Override
    public boolean equals(Object other) {
        if (other instanceof Student)
            return (studentID == ((Student)other).getStudentID());
        return false;
    }

    public String toString() {
        String returnVal = "";
        returnVal += studentID + " : " + name + " : " + gpa + " : " + financialNeed + " FAFSA: " + fafsa;
        return returnVal;
    }
    
}
