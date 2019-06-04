package Baddies;

import Players.Player;

public class Dentist extends Baddie {

    public Dentist(String name, String weapon, int speed, int brutality, int weaponEffectiveness) {
        super(name, weapon, speed, brutality, weaponEffectiveness);
    }

    public void attack(Player player){
        int damage = this.getBrutality() * this.getWeaponEffectiveness() * 10;
        player.decreaseHealth(damage);
    }
}
