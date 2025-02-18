package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    protected void setName(String aName) {
        name = aName;
    }

    public Integer getStudentId() {
        return studentId;
    }
    protected void setName(Integer aStudentId) {
        studentId = aStudentId;
    }

    public Integer getNumberOfCredits() {
        return numberOfCredits;
    }
    protected void setNumberOfCredits(Integer aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public Double getGpa() {
        return gpa;
    }
    protected void setGpa(Double aGpa) {
        gpa = aGpa;
    }
}