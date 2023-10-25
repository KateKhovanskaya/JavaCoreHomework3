package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", "Ivanov", 12, 10,
                1986, 2000);
        Employee manager1 = new Manager("Fedor", "Proskotin", 12,
                10, 1980, 2200);
        Employee emp2 = new Employee("Grigory", "Solyaev", 3, 6,
                1982, 1200);

        CompanyEmployees companyEmployees= new CompanyEmployees();
        companyEmployees.addEmployee(emp1);
        companyEmployees.addEmployee(manager1);
        companyEmployees.addEmployee(emp2);

        System.out.println(companyEmployees.getAllEmployees());
        companyEmployees.raiseSalary(2);
        System.out.println(companyEmployees.getAllEmployees());
    }
}