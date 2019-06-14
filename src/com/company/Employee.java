package com.company;

public class Employee {

    private String firstName;
    private String surname;
    private int annualSalary;
    private double superRate;


    public Employee(String firstName, String surname, int annualSalary, double superRate) {
        this.firstName = firstName;
        this.surname = surname;
        this.annualSalary = annualSalary;
        this.superRate = superRate;
    }

    public String getFullName() {
        return firstName + " " + surname;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public double getSuperRate() {
        return superRate;
    }
}
