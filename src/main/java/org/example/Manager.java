package org.example;

public class Manager extends Employee{
    static int salaryRatio;
    public Manager(String firstname, String lastname, int dayOfBirth, int monthOfBirth,
                   int yearOfBirth, int salary){
        super(firstname, lastname, dayOfBirth, monthOfBirth, yearOfBirth, salary);
    }



    static void setSalaryRatio(int ratio){
        salaryRatio = 1;
    }
    public static int getSalaryRatio(){
        return salaryRatio;
    }
    public void raiseSalary(){
        setSalary(this.getSalary() * getSalaryRatio());
    }
}
