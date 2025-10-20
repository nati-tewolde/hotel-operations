package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 100, true, false);
        Room room2 = new Room(1, 100, false, true);
        Room room3 = new Room(1, 100, false, false);

        Reservation reservation1 = new Reservation("double", 8, true);
        Reservation reservation2 = new Reservation("king", 5, false);

        Employee employee1 = new Employee(123, "Nati", "HR", 15, 38);
        Employee employee2 = new Employee(321, "Nate", "Accounting", 15, 45);

        System.out.println(room1.isAvailable());
        System.out.println(room2.isAvailable());
        System.out.println(room3.isAvailable());
        System.out.println(reservation1.getPrice() + " " + reservation1.getReservationTotal());
        System.out.println(reservation2.getPrice() + " " + reservation2.getReservationTotal());
        System.out.println(employee1.getRegularHours() + " " + employee1.getOvertimeHours() + " " + employee1.getTotalPay());
        System.out.println(employee2.getRegularHours() + " " + employee2.getOvertimeHours() + " " + employee2.getTotalPay());

    }
}
