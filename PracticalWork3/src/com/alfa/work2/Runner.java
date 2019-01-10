package com.alfa.work2;

public class Runner {

    public void run() {
        Employee employee = new Employee("James", "May");
        Employee employee1 = new Employee("Jeremy", "Clarcson", "occ2", "+3809998123");
        Employee employee2 = new Employee("Richard", "Hamond", "occ1", "+3809998989");

        System.out.println(Employee.getNumberOfEmployee());

    }
}
