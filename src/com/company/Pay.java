package com.company;

class Pay {

    private String startDate;
    private String endDate;
    private int annualSalary;
    private double superRate;

    Pay(Employee employee, String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.annualSalary = employee.getAnnualSalary();
        this.superRate = employee.getSuperRate();
    }

    String payPeriod() {
        return startDate + " - " + endDate;
    }

    int incomeTax() {
        TaxCalculator taxCalculator = new TaxCalculator();
        return (int) Math.round(taxCalculator.taxOnIncome(annualSalary)/12);
    }

    int grossIncome() {
        return (int) Math.round(annualSalary/12.0);
    }

    int netIncome() {
        return grossIncome() - incomeTax();
    }

    int monthlySuper() {
        return (int) Math.round(grossIncome() * superRate);
    }

}
