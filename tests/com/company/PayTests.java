package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayTests {

    @Test
    public void anAnnualSalaryOf60050_returnsGrossIncomeOf5004() {
        Employee employee = new Employee("Bianca", "Carnevale", 60050, 0.09);
        Pay pay = new Pay(employee, "01 March", "31 March");

       double actualGrossIncome = pay.grossIncome();

       assertEquals(5004, actualGrossIncome);

    }

    @Test
    public void anAnnualSalaryOf120500_returnsGrossIncomeOf10042() {
        Employee employee = new Employee("Bianca", "Carnevale", 120500, 0.09);
        Pay pay = new Pay(employee, "01 March", "31 March");

        double actualGrossIncome = pay.grossIncome();

        assertEquals(10042, actualGrossIncome);

    }

    @Test
    public void anAnnualSalaryOf60050_returnsIncomeTaxOf922() {
        Employee employee = new Employee("Bianca", "Carnevale", 60050, 0.09);
        Pay pay = new Pay(employee, "01 March", "31 March");

        double actualIncomeTax = pay.incomeTax();

        assertEquals(922, actualIncomeTax);

    }

    @Test
    public void anAnnualSalaryOf60050_returnsNetIncomeOf4082() {
        Employee employee = new Employee("Bianca", "Carnevale", 60050, 0.09);
        Pay pay = new Pay(employee, "01 March", "31 March");

        double actualNetIncome = pay.netIncome();

        assertEquals(4082, actualNetIncome);
    }

    @Test
    public void anAnnualSalaryOf60050_returnsSuperOf450() {
        Employee employee = new Employee("Bianca", "Carnevale", 60050, 0.09);
        Pay pay = new Pay(employee, "01 March", "31 March");

        double actualSuper = pay.monthlySuper();

        assertEquals(450, actualSuper);
    }
}
