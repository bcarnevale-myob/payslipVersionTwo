package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaySlipGeneratorTests {

    @Test
    public void aPayslipCanBeGenerated() {
        List<String> userResponses = new ArrayList<>();
        userResponses.add("Bianca");
        userResponses.add("Carnevale");
        userResponses.add("60050");
        userResponses.add("0.09");
        userResponses.add("01 March");
        userResponses.add("31 March");

        String expectedPayslip = "Name: Bianca Carnevale\n" +
                "Pay Period: 01 March - 31 March\n" +
                "Gross Income: 5004\n" +
                "Income Tax: 922\n" +
                "Net Income: 4082\n" +
                "Super: 450";

        PaySlipGenerator paySlip = new PaySlipGenerator(new MockWriter(), new MockReader(userResponses));

        String actualPaySlip = paySlip.getPaySlip();

        assertEquals(expectedPayslip, actualPaySlip);

    }

}
