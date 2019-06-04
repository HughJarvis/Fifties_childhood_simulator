package Baddies;

import Players.Player;

public abstract class Baddie {

    private String name;
    private String weapon;
    private int speed;
    private int brutality;
    private int weaponEffectiveness;

    public Baddie(String name, String weapon, int speed, int brutality, int weaponEffectiveness) {
        this.name = name;
        this.weapon = weapon;
        this.speed = speed;
        this.brutality = brutality;
        this.weaponEffectiveness = weaponEffectiveness;
    }

    public abstract void attack(Player player);

    public String getWeapon(){
        return this.weapon;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeaponEffectiveness() {
        return this.weaponEffectiveness;
    }

    public int getBrutality() {
        return this.brutality;


    }
}
