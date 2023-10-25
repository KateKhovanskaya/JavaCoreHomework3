package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployees {
    private List<Employee> employees;

    public CompanyEmployees(){
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }

    public void raiseSalary(int ratio){
        Employee.setSalaryRatio(ratio);
        Manager.setSalaryRatio(ratio);

        for (Employee emp: employees) {
            emp.raiseSalary();
        }
    }
}
