package Hazards;

public abstract class Hazard {

    private int healthThreat;

    public Hazard(int healthThreat) {
        this.healthThreat = healthThreat;

    }

    public int getHealthThreat() {
        return healthThreat;
    }
}