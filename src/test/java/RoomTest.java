import Rooms.Room;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room1;


    @Before
    public void before() {
        room1 = new Room(RoomType.SINGLE);
    }


    @Test
    public void getCapacity() {
        assertEquals(1, room1.getCapacity());

    }

    @Test
    public void getPrice(){
        assertEquals(50.00,room1.getPrice(), 0.1);
    }

    @Test
    public void canSetPrice(){
        room1.setPrice(60.00);
        assertEquals(60.00,room1.getPrice(), 0.1);
    }






}
