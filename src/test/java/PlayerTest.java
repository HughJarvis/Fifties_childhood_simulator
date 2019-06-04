import Players.Player;
import Prizes.Bottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Bottle bottle;


    @Before
    public void setUp(){
        player = new Player("Shuggy");
        bottle = new Bottle("Ginger");
    }

    @Test
    public void canGetName() {
        assertEquals("Shuggy", player.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void girdLivesStartsAt5() {
        assertEquals(5, player.getGirdLives());
    }

    @Test
    public void canGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void canLoseGirdLife(){
        player.loseGirdLife();
        assertEquals(4, player.getGirdLives());
    }

    @Test
    public void canScorePoints() {
        player.scoresPoints(100);
        assertEquals(100, player.getScore());
    }

    @Test
    public void canIncreaseHealth() {
        player.increaseHealth(10);
        assertEquals(110, player.getHealth());
    }

    @Test
    public void canDecreaseHealth() {
        player.decreaseHealth(10);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void canCollectBottle() {
        player.collectBottle(bottle);
        assertEquals(1, player.getBottles().size());
    }


    @Test
    public void canCountBottles() {
        player.collectBottle(bottle);
        assertEquals(1, player.countBottles());
    }

    @Test
    public void canEatPiece() {
        player.eatPiece();
        assertEquals(110, player.getHealth());
    }

    @Test
    public void canCashInBottles() {
        player.collectBottle(bottle);
        player.cashInBottles();
        assertEquals(20, player.getScore());
        assertEquals(0, player.countBottles());
    }
}
