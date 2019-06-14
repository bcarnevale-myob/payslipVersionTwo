package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTests {

    @Test
    public void anAnnualSalaryOf60050_returnsGrossIncomeOf5004() {
       Income income = new Income();

       double actualGrossIncome = income.grossIncome(60050);

       assertEquals(5004, actualGrossIncome);

    }

    @Test
    public void anAnnualSalaryOf120500_returnsGrossIncomeOf10042() {
        Income income = new Income();

        double actualGrossIncome = income.grossIncome(120500);

        assertEquals(10042, actualGrossIncome);

    }

    @Test
    public void anAnnualSalaryOf60050_returnsIncomeTaxOf922() {
        Income income = new Income();

        double actualIncomeTax = income.incomeTax(60050);

        assertEquals(922, actualIncomeTax);

    }

    @Test
    public void anAnnualSalaryOf60050_returnsNetIncomeOf4082() {
        Income income = new Income();

        double actualNetIncome = income.netIncome(60050);

        assertEquals(4082, actualNetIncome);
    }
}
