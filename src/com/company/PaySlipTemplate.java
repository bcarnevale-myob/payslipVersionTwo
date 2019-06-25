package com.company;

public class PaySlipTemplate {

    private Employee employee;
    private Pay pay;

    public PaySlipTemplate(Employee employee, Pay pay) {
        this.employee = employee;
        this.pay = pay;
    }

    String getPaySlipTemplate() {
        return "Name: " + employee.getFullName() + "\n" +
                "Pay Period: " + pay.payPeriod() + "\n" +
                "Gross Income: " + pay.grossIncome() + "\n" +
                "Income Tax: " + pay.incomeTax() + "\n" +
                "Net Income: " + pay.netIncome() + "\n" +
                "Super: " + pay.monthlySuper();
    }
}
