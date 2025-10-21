package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double lastPunchInTime;
    private boolean isClockedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.lastPunchInTime = 0;
        this.isClockedIn = false;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        return (hoursWorked <= 40) ? hoursWorked : 40;
    }

    public double getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * (payRate * 1.5));
    }

    public boolean punchTimeCard(double time) {
        if (!isClockedIn) {
            lastPunchInTime = time;
            isClockedIn = true;
            return true;
        } else {
            double shiftHoursWorked = time - lastPunchInTime;
            hoursWorked += shiftHoursWorked;
            isClockedIn = false;
            lastPunchInTime = 0;
            return false;
        }
    }
}
