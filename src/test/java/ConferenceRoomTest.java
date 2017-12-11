


import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, "the room of conferences");
    }


    @Test
    public void canGetName(){
        assertEquals("the room of conferences", conferenceRoom.getRoomName());
    }

    @Test
    public void canSetName(){
        conferenceRoom.setRoomName("changed name");
        assertEquals("changed name", conferenceRoom.getRoomName());
    }

}