package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {

    @Test
    public void canCreateAnEmployee_thenReturnTheirFullName() {
        Employee employee = new Employee("Bianca", "Carnevale", 60050, 0.09);

        String expectedFullName = "Bianca Carnevale";
        String actualFullName = employee.getFullName();

        assertEquals(expectedFullName, actualFullName);
    }

}
