import Baddies.RazorGang;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RazorGangTest {

    RazorGang razorGang;
    Player player;

    @Before
    public void setUp(){
        razorGang = new RazorGang("Fleeto", "Razor", 10, 3, 3);
        player = new Player("Jamo");
    }

    @Test
    public void canGetName() {
        assertEquals("Fleeto", razorGang.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals("Razor", razorGang.getWeapon());
    }

    @Test
    public void canGetSpeed() {
        assertEquals(10, razorGang.getSpeed());
    }

    @Test
    public void canGetBrutality() {
        assertEquals(3, razorGang.getBrutality());
    }

    @Test
    public void canGetWeaponEffectiveness() {
        assertEquals(3, razorGang.getWeaponEffectiveness());
    }

    @Test
    public void canAttackPlayer() {
        razorGang.attack(player);
        assertEquals(10, player.getHealth());
        assertEquals(4, player.getGirdLives());
    }
}
