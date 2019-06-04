import Hazards.BarbedWire;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbedWireTest {

    BarbedWire barbedWire;
    Player player;

    @Before
    public void setUp(){
        barbedWire = new BarbedWire(10);
        player = new Player("Sid");
    }

    @Test
    public void canMaim(){
        barbedWire.maim(player);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void canBump() {
        barbedWire.bump(player);
        assertEquals(4, player.getGirdLives());
    }
}
