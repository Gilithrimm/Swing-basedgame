package com.safenar.data;

import java.awt.*;
import java.util.Random;

public abstract class Entity extends CollidingObject{
    protected final Random random = new Random();
    protected final Stats stats;

    public Entity(Rectangle collisionBox, Stats stats) {
        super(collisionBox);
        this.stats = stats;
    }

    public int getSpeed() {
        return stats.getSpeed();
    }

    public void setSpeed(int speed) {
        stats.setSpeed(speed);
    }

    public int getHealth() {
        return stats.getHp();
    }

    public void setHealth(int health) {
        stats.setHp(health);
    }

    public int getAttack() {
        return stats.getAttack();
    }

    public void setAttack(int attack) {
        stats.setAttack(attack);
    }

    public int getDefense() {
        return stats.getDefense();
    }

    public void setDefense(int defense) {
        stats.setDefense(defense);
    }

    public int getLuck() {
        return stats.getLuck();
    }

    public void setLuck(int luck) {
        stats.setLuck(luck);
    }

    public int getMana() {
        return stats.getMana();
    }

    public void setMana(int mana) {
        stats.setMana(mana);
    }

    public int getMaxHealth() {
        return stats.getMaxHp();
    }

    public void setMaxHealth(int maxHealth) {
        stats.setMaxHp(maxHealth);
    }

    public int getMaxMana() {
        return stats.getMaxMana();
    }

    public void setMaxMana(int maxMana) {
        stats.setMaxMana(maxMana);
    }

    public abstract void onCollision(CollidingObject other);

    public abstract void onDeath();

    public void onHit(int damage){
        setHealth(getHealth()-(damage-getDefense()));
        if (getHealth() <= 0){
            onDeath();
        }
    }
}
