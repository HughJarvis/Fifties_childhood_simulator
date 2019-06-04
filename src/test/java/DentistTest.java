import Baddies.Dentist;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DentistTest {

    Dentist dentist;
    Player player;

    @Before
    public void setUp(){
        dentist = new Dentist("Mr Simpson", "pliers", 10, 1, 1);
        player = new Player("Geech");
    }

    @Test
    public void canAttack(){
        dentist.attack(player);
        assertEquals(90, player.getHealth());
    }
}
