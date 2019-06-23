package com.company;

class Employee {

    private String firstName;
    private String surname;
    private int annualSalary;
    private double superRate;

    Employee(String firstName, String surname, int annualSalary, double superRate) {
        this.firstName = firstName;
        this.surname = surname;
        this.annualSalary = annualSalary;
        this.superRate = superRate;
    }

    String getFullName() {
        return firstName + " " + surname;
    }

    int getAnnualSalary() {
        return annualSalary;
    }

    double getSuperRate() {
        return superRate;
    }
}
