package Players;

import Prizes.Bottle;

import java.util.ArrayList;

public class Player {

    private String name;
    private int health;
    private int score;
    private int girdLives;
    private ArrayList<Bottle> bottles;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.score = 0;
        this.girdLives = 5;
        this.bottles = new ArrayList<Bottle>();

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getGirdLives() {
        return girdLives;
    }

    public ArrayList<Bottle> getBottles() {
        return this.bottles;
    }

    public int getScore() {
        return this.score;
    }

    public void loseGirdLife() {
        this.girdLives -= 1;
    }

    public void scoresPoints(int points) {
        this.score += points;
    }


    public void increaseHealth(int points) {
        this.health += points;
    }

    public void collectBottle(Bottle bottle) {
        this.bottles.add(bottle);
    }

    public int countBottles(){
        return this.getBottles().size();
    }

    public void loseAllBottles(){
        this.bottles.clear();
    }

    public void eatPiece() {
        this.increaseHealth(10);
    }

    public void decreaseHealth(int points) {
        this.health -= points;
    }

    public void cashInBottles() {
        for (Bottle bottle : this.bottles){
            this.scoresPoints(20);
        }
        this.loseAllBottles();
    }
}
