package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaySlipTests {

    @Test
    public void aPayslipCanBeGenerated() {
        String expectedPayslip = "Name: Bianca Carnevale\n" +
                "Pay Period: 01 March - 31 March\n" +
                "Gross Income: 5004\n" +
                "Income Tax: 922\n" +
                "Net Income: 4082\n" +
                "Super: 450";

        Employee employee = new Employee("Bianca", "Carnevale", 60050, 0.09);
        Pay pay = new Pay(employee, "01 March", "31 March");

        assertEquals(expectedPayslip, pay.generatePaySlip());
    }
}
