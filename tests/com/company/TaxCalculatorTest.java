package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void anAnnualSalaryOf0_returnsTaxAmount0() {
        Employee employee = new Employee("Bianca", "Carnevale", 0, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(0, actualTax);
    }

    @Test
    public void anAnnualSalaryOf18200_returnsTaxAmount0() {
        Employee employee = new Employee("Bianca", "Carnevale", 18200, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(0, actualTax);
    }

    @Test
    public void anAnnualSalaryOf18203_returnsTaxAmount1() {
        Employee employee = new Employee("Bianca", "Carnevale", 18203, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(1, actualTax);
    }

    @Test
    public void anAnnualSalaryOf37000_returnsTaxAmount3572() {
        Employee employee = new Employee("Bianca", "Carnevale", 37000, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(3572, actualTax);
    }

    @Test
    public void anAnnualSalaryOf37001_returnsTaxAmount3572() {
        Employee employee = new Employee("Bianca", "Carnevale", 37001, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(3572, actualTax);
    }

    @Test
    public void anAnnualSalaryOf87000_returnsTaxAmount19822() {
        Employee employee = new Employee("Bianca", "Carnevale", 87000, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(19822, actualTax);
    }

    @Test
    public void anAnnualSalaryOf87001_returnsTaxAmount19822() {
        Employee employee = new Employee("Bianca", "Carnevale", 87001, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(19822, actualTax);
    }

    @Test
    public void anAnnualSalaryOf180000_returnsTaxAmount54232() {
        Employee employee = new Employee("Bianca", "Carnevale", 180000, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(54232, actualTax);
    }

    @Test
    public void anAnnualSalaryOf180001_returnsTaxAmount54232() {
        Employee employee = new Employee("Bianca", "Carnevale", 180001, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(54232, actualTax);
    }

    @Test
    public void anAnnualSalaryOf200000_returnsTaxAmount63232() {
        Employee employee = new Employee("Bianca", "Carnevale", 200000, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(63232, actualTax);
    }

}
