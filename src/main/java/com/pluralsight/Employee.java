package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.startTime = 0;
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

    public void punchIn(double time) {
        startTime = time;
    }

    public void punchIn() {
        LocalTime time = LocalTime.now();
        double hour = time.getHour();
        double minutes = time.getMinute() / 60.0;
        double currentTime = hour + minutes;
        punchIn(currentTime);
    }

    public void punchOut(double time) {
        hoursWorked += time - startTime;
        startTime = 0;
    }

    public void punchOut() {
        LocalTime time = LocalTime.now();
        double hour = time.getHour();
        double minutes = time.getMinute() / 60.0;
        double currentTime = hour + minutes;
        punchOut(currentTime);
    }

    public void punchTimeCard(double time) {
        if (startTime == 0) {
            startTime = time;
        } else {
            hoursWorked += time - startTime;
            startTime = 0;
        }
    }
}
