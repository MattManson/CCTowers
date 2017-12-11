package Rooms;

import Guests.Guest;
import java.util.ArrayList;

public class Room {
    protected RoomType roomType;
    protected ArrayList<Guest> guests;
    protected int capacity;
    protected  double price;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
        this.capacity = roomType.getTypeCapacity();
        this.price = roomType.getTypePrice();
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
