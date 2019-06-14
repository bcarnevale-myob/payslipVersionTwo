package com.company;

public class SuperCalculator {

    private double grossIncome;
    private double superRate;

    public SuperCalculator(double grossIncome, double superRate) {
        this.grossIncome = grossIncome;
        this.superRate = superRate;
    }

    public double monthlySuper() {
        return Math.round(grossIncome * superRate);
    }

}
