package com.safenar.data;

import com.safenar.Main;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends Entity{

    public Player(int posX, int posY, Stats stats) {
        super(posX, posY, stats);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d=(Graphics2D) g;
        g2d.setColor(new Color(255,175,0));
        g2d.fillRect(getPosX(),getPosY(),30,30);
        g2d.setColor(new Color(255, 100,0));
        g2d.fillOval(getPosX()+5,getPosY()-15,35,35);
    }

    public void move(int keyCode){
        switch (keyCode) {
            case KeyEvent.VK_LEFT -> posX-=10;
            case KeyEvent.VK_RIGHT -> posX+=10;
//            case KeyEvent.VK_UP -> jump();
            default -> Main.println("Unhandled keycode. Sorry!");
        }
    }

    public void jump(int gravity){

    }
}
