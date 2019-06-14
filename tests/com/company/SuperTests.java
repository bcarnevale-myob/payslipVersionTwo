package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperTests {

    @Test
    public void aGrossIncomeOf5004WithSuperRateOf9Percent_returnsSuperValueOf450() {
        SuperCalculator superCalculator = new SuperCalculator(5004, 0.09);

        double actualMonthlySuper = superCalculator.monthlySuper();

        assertEquals(450, actualMonthlySuper);
    }
}
