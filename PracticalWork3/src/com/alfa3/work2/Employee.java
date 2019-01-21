package com.alfa3.work2;

public class Employee {


    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    private static int numberOfEmployee;


    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public Employee(String firstName, String lastName) {

        this(firstName, lastName, "", "");
    }

    public Employee() {
    }

    {
        numberOfEmployee++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }
}
