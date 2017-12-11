package Rooms;

public enum RoomType {

    SINGLE("Single", 1, 50.00),
    DOUBLE("Double", 2, 80.00),
    FAMILY("Family", 4, 120.00),
    DININGROOM("Dining Room", 666, 10.00),
    CONFERENCEROOM("Conference Room", 3000, 1000.00);

    protected final String name;
    private final int value;
    private final double price;

    RoomType(String name, int value, double price){
        this.name = name;
        this.value = value;
        this.price = price;
    }

    public int getTypeCapacity(){
        return this.value;
    }


    public double getTypePrice() {
        return this.price;
    }

    public String roomTypeName() {
        return this.name;
    }
}
