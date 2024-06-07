package models;

public class Room {
    private String roomNumber;
    private int capacity;

    public Room(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public Room() {
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Capacity: " + capacity;
    }
}
