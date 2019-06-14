package com.company;

public class TaxCalculator {

    public long taxOnIncome(int annualSalary) {
        double tax = 0;
        if(annualSalary > 180000) {
            tax = 54232 + (annualSalary - 180000)*0.45;
        } else if(annualSalary > 87000) {
            tax = 19822 + (annualSalary - 87000)*0.37;
        } else if(annualSalary > 37000) {
            tax = 3572 + (annualSalary - 37000)*0.325;
        } else if(annualSalary > 18200) {
            tax = (annualSalary - 18200)*0.19;
        }
        return Math.round(tax);
    }


}
