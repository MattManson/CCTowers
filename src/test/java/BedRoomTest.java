

import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 101);
    }

    @Test
    public void capacityByType(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }


}