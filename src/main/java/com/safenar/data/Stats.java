package com.safenar.data;

public class Stats {
    public static final Stats EMPTY = new Stats(0,0,0,0,0,0);
    private int attack;
    private int defense;
    private int speed;
    private int luck;
    private int hp;
    private int mana;
    private int maxHp;
    private int maxMana;

    public Stats(int attack, int defense, int speed,int luck, int hp, int mana) {
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.luck = luck;
        this.hp = hp;
        this.mana = mana;
        setMaxHp(hp);
        setMaxMana(mana);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int hp) {
        maxHp = hp;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int mana) {
        maxMana = mana;
    }

    @Override
    public String toString() {
        return "Stats:[" +
                "ATK " + attack +
                ", DEF " + defense +
                ", SPD " + speed +
                ", HP " + hp +'/' + maxHp +
                ", MP " + mana + '/' + maxMana +
                ']';
    }
}
