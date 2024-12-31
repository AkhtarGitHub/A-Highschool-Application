// Student.java
public class Student extends Person {
    protected String myIdNum; // Student ID Number
    protected double myGPA;   // Grade Point Average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Calls the constructor of Person
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Getter and Setter for ID Number
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    // Getter and Setter for GPA
    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
