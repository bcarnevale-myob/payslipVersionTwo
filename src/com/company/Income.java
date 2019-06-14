package com.company;

public class Income {

    public double incomeTax(int annualSalary) {
        TaxCalculator taxCalculator = new TaxCalculator();
        return Math.round(taxCalculator.taxOnIncome(annualSalary)/12);
    }

    public double grossIncome(int annualSalary) {
        return Math.round(annualSalary/12.0);
    }

    public double netIncome(int annualSalary) {
        return grossIncome(annualSalary) - incomeTax(annualSalary);
    }
}
