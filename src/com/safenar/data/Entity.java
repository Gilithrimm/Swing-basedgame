package com.safenar.data;

public class Entity {
    private int posX;
    private int posY;
    private Stats stats;

    public Entity(int posX, int posY, Stats stats) {
        this.posX = posX;
        this.posY = posY;
        this.stats = stats;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
