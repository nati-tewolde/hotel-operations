package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public boolean checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
            return true;
        }
        return false;
    }

    public boolean checkOut() {
        if (isOccupied) {
            isOccupied = false;
            return true;
        }
        return false;
    }

    public boolean cleanRoom() {
        if (isDirty && !isOccupied) {
            isDirty = false;
            return true;
        }
        return false;
    }
}
