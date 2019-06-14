package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    @Test
    public void anAnnualSalaryOf0_returnsTaxAmount0() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(0);

        assertEquals(0, actualTax);
    }

    @Test
    public void anAnnualSalaryOf18200_returnsTaxAmount0() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(18200);

        assertEquals(0, actualTax);
    }

    @Test
    public void anAnnualSalaryOf18203_returnsTaxAmount1() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(18203);

        assertEquals(1, actualTax);
    }

    @Test
    public void anAnnualSalaryOf37000_returnsTaxAmount3572() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(37000);

        assertEquals(3572, actualTax);
    }

    @Test
    public void anAnnualSalaryOf37001_returnsTaxAmount3572() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(37001);

        assertEquals(3572, actualTax);
    }

    @Test
    public void anAnnualSalaryOf87000_returnsTaxAmount19822() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(87000);

        assertEquals(19822, actualTax);
    }

    @Test
    public void anAnnualSalaryOf87001_returnsTaxAmount19822() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(87001);

        assertEquals(19822, actualTax);
    }

    @Test
    public void anAnnualSalaryOf180000_returnsTaxAmount54232() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(180000);

        assertEquals(54232, actualTax);
    }

    @Test
    public void anAnnualSalaryOf180001_returnsTaxAmount54232() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(180001);

        assertEquals(54232, actualTax);
    }

    @Test
    public void anAnnualSalaryOf200000_returnsTaxAmount63232() {
        TaxCalculator taxCalculator = new TaxCalculator();

        double actualTax = taxCalculator.taxOnIncome(200000);

        assertEquals(63232, actualTax);
    }

}
