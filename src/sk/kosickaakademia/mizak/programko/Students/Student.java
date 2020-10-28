package sk.kosickaakademia.mizak.programko.Students;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private classType classType;
    private int salary;
    private Date dob;
    private Credit grades;

    public <setDob> Student(String fname, String lastName, Credit grades, classType classname){
        firstName=fname;
        this.lastName=lastName;
        this.grades=grades;
        this.classType=classname;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(LocalDate datum) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public sk.kosickaakademia.mizak.programko.Students.classType getClassType() {
        return classType;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDob() {
        return dob;
    }

    public Credit getGrades() {
        return grades;
    }
}
