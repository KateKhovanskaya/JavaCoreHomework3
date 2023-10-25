package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee implements  Comparable<Employee>{
    private String firstname;
    private String lastname;
    private Calendar birthday = new GregorianCalendar();
    private int salary;
    static int salaryRatio;


    public Employee(String firstname, String lastname, int dayOfBirth, int monthOfBirth,
                    int yearOfBirth, int salary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday.set(Calendar.DAY_OF_MONTH, dayOfBirth);
        this.birthday.set(Calendar.MONTH, monthOfBirth);
        this.birthday.set(Calendar.YEAR, yearOfBirth);
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    private Calendar getBirthday(){
        return birthday;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o){
        return this.getBirthday().compareTo(o.getBirthday());
    }

    static void setSalaryRatio(int ratio){
        salaryRatio = ratio;
    }
    public void raiseSalary(){
        setSalary(this.getSalary() * getSalaryRatio());
    }
    public static int getSalaryRatio(){
        return salaryRatio;
    }

    @Override
    public String toString(){
        return this.getFirstname() + " " + this.getLastname() + ", " + this.getSalary() + "; ";
    }
}
