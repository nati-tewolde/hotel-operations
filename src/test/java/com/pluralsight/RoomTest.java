package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_roomIsAvailable_setRoomAsOccupiedAndDirty() {
        // Arrange
        Room room1 = new Room(2, 99.99);
        boolean expectedResult = false;

        // Act
        room1.checkIn();

        // Assert
        boolean actualResult = room1.isAvailable();
        assertEquals(expectedResult, actualResult);
        /*assertFalse(room1.isOccupied());
        assertTrue(room1.isDirty());*/
    }


    @Test
    public void checkIn_roomAlreadyOccupied_noChange() {
        // Arrange
        Room room1A = new Room(2, 99.99);
        boolean expectedResult = false;
        room1A.checkIn();

        // Act
        room1A.checkIn();

        // Assert
        boolean actualResult = room1A.isAvailable();
        assertEquals(expectedResult, actualResult);
        /*assertTrue(room1.isOccupied());
        assertTrue(room1.isDirty());*/
    }


    @Test
    public void checkOut_roomIsOccupied_setRoomAsDirtyAndAvailable() {
        // Arrange
        Room room2 = new Room(1, 49.99);
        boolean expectedResult = false;

        // Act
        room2.checkOut();

        // Assert
        boolean actualResult = room2.isOccupied();
        assertEquals(expectedResult, actualResult);
        /*assertFalse(room2.isOccupied());
        assertTrue(room2.isDirty());*/
    }

    @Test
    public void cleanRoom_roomIsDirty_setRoomAsClean() {
        // Arrange
        Room room3 = new Room(3, 124.99);
        boolean expectedResult = false;

        // Act
        room3.cleanRoom();

        // Assert
        boolean actualResult = room3.isDirty();
        assertEquals(expectedResult, actualResult);
        /*assertFalse(room3.isDirty());*/
    }


}