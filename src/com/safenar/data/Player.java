package com.safenar.data;

import com.safenar.Main;

import java.awt.event.KeyEvent;

public class Player extends Entity{

    public Player(int posX, int posY, Stats stats) {
        super(posX, posY, stats);
    }

    public void move(int keyCode){
        switch (keyCode) {
            case KeyEvent.VK_LEFT -> setPosX(getPosX() - 10);
            case KeyEvent.VK_RIGHT -> setPosX(getPosX() + 10);
            case KeyEvent.VK_UP -> jump();
            default -> Main.println("Unhandled keycode. Sorry!");
        }
    }

    public void jump(){

    }
}
