// Teacher.java
public class Teacher extends Person {
    private String mySubject; // Subject taught by the teacher
    private double mySalary;  // Salary of the teacher

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Calls the constructor of Person
        this.mySubject = subject;
        this.mySalary = salary;
    }

    // Getter and Setter for Subject
    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        this.mySubject = subject;
    }

    // Getter and Setter for Salary
    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        this.mySalary = salary;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}
