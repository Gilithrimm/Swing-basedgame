package com.safenar.data;

import com.safenar.Main;

import java.awt.event.KeyEvent;

public class Player {
    private int posX;
    private int posY;
    private Stats stats;

    public Player(int posX, int posY, Stats stats) {
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

    public void move(int keyCode){
        switch (keyCode) {
            case KeyEvent.VK_LEFT -> setPosX(getPosX() - 10);
            case KeyEvent.VK_RIGHT -> setPosX(getPosX() + 10);
            default -> Main.println("Unhandled keycode. Sorry!");
        }
    }
}
