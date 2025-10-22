package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_RoomIsAvailable_SetRoomAsOccupiedAndDirty() {
        // Arrange
        Room room1 = new Room(2, 99.99);

        // Act
        room1.checkIn();

        // Assert
        assertTrue(room1.isOccupied());
        assertTrue(room1.isDirty());
    }


    @Test
    public void checkIn_RoomAlreadyOccupied_RoomNotOccupied() {
        // Arrange
        Room room1A = new Room(2, 99.99);
        room1A.checkIn();
        room1A.checkOut();

        // Act
        room1A.checkIn();

        // Assert
        assertFalse(room1A.isOccupied());
    }


    @Test
    public void checkOut_RoomIsOccupied_RoomIsNotOccupied() {
        // Arrange
        Room room2 = new Room(1, 49.99);
        room2.checkIn();

        // Act
        room2.checkOut();

        // Assert
        assertFalse(room2.isOccupied());
    }

    @Test
    public void cleanRoom_RoomIsDirty_SetRoomAsClean() {
        // Arrange
        Room room3 = new Room(3, 124.99);
        room3.checkIn();
        room3.checkOut();

        // Act
        room3.cleanRoom();

        // Assert
        assertFalse(room3.isDirty());
    }


}