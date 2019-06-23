package com.company;

public class PaySlipGenerator {

    private Writer writer;
    private Reader reader;
    private Employee employee;
    private Pay pay;

    public PaySlipGenerator(Writer writer, Reader reader) {
        this.reader = reader;
        this.writer = writer;

        writer.write(welcomeMessage());
        getEmployeeInformation();
        displayPayslip();
    }

    private String welcomeMessage() {
       return "Welcome to the payslip generator!";
    }

    private void getEmployeeInformation() {
        String firstName = reader.prompt("Please input your name: ");
        String lastName = reader.prompt("Please input your last name: ");
        int annualSalary = Integer.parseInt(reader.prompt("Please input your annual salary: "));
        double superRate = Double.parseDouble(reader.prompt("Please input your annual super rate: "));
        String startDate = reader.prompt("Please input your start date: ");
        String endDate = reader.prompt("Please input your end date: ");

        this.employee = new Employee(firstName, lastName, annualSalary, superRate);
        this.pay = new Pay(employee, startDate, endDate);
    }

    public String getPaySlip() {
        return "Name: " + employee.getFullName() + "\n" +
                "Pay Period: " + pay.payPeriod() + "\n" +
                "Gross Income: " + pay.grossIncome() + "\n" +
                "Income Tax: " + pay.incomeTax() + "\n" +
                "Net Income: " + pay.netIncome() + "\n" +
                "Super: " + pay.monthlySuper();
    }

    private void displayPayslip() {
        writer.write("Your payslip has been generated:");
        writer.write(getPaySlip());
    }

}
