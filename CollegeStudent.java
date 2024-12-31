// CollegeStudent.java
public class CollegeStudent extends Student {
    private String myMajor; // Major of the college student
    private int myYear;     // Current year in college (e.g., FROSH = 1)

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Calls Student's constructor
        this.myYear = year;
        this.myMajor = major;
    }

    // Getter and Setter for year
    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        this.myYear = year;
    }

    // Getter and Setter for major
    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        this.myMajor = major;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}
