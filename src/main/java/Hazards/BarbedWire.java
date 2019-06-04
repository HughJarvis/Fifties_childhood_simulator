package Hazards;

import Players.Player;

public class BarbedWire extends Hazard implements IBump, IMaim {

    public BarbedWire(int healthThreat) {
        super(healthThreat);
    }

    public void bump(Player player) {
        player.loseGirdLife();
    }

    public void maim(Player player) {

        player.decreaseHealth(this.getHealthThreat());
    }
}
