package com.company;

public class Pay {

    private String startDate;
    private String endDate;
    private int annualSalary;
    private double superRate;

    public Pay(Employee employee, String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.annualSalary = employee.getAnnualSalary();
        this.superRate = employee.getSuperRate();
    }

    public String payPeriod() {
        return startDate + " - " + endDate;
    }

    public int incomeTax() {
        TaxCalculator taxCalculator = new TaxCalculator();
        return (int) Math.round(taxCalculator.taxOnIncome(annualSalary)/12);
    }

    public int grossIncome() {
        return (int) Math.round(annualSalary/12.0);
    }

    public int netIncome() {
        return grossIncome() - incomeTax();
    }

    public int monthlySuper() {
        return (int) Math.round(grossIncome() * superRate);
    }

}
