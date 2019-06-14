package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculationTest {

    @Test
    public void anAnnualSalaryOf0_returns0Tax() {
        Employee employee = new Employee("Bianca", "Carnevale", 0, 0.09);
        int annualSalary = employee.getAnnualSalary();

        TaxCalculator taxCalculator = new TaxCalculator();

        int actualTax = taxCalculator.taxOnIncome(annualSalary);

        assertEquals(0, actualTax);
    }

}
