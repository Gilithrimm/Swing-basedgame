package com.safenar.data;

public class Stats {
    private int attack;
    private int defence;
    private int speed;
    private int hp;
    private int mana;

    public Stats(int attack, int defence, int speed) {
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Stats:[" +
                "ATK " + attack +
                ", DEF " + defence +
                ", SPD " + speed +
                ", HP " + hp +
                ", MP " + mana +
                ']';
    }
}
