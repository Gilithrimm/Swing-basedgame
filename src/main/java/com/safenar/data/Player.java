package com.safenar.data;

import com.safenar.Main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Player extends Entity{
//    private int level;
//    private int exp;//will I need this?
    int speedY=getY();
    List<Ability> abilities;
    public Player(int posX, int posY, Stats stats) {
        super(new Rectangle(posX,posY,50,40),stats);
        abilities=new ArrayList<>();
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d=(Graphics2D) g;
        g2d.setColor(new Color(255,175,0));
        g2d.fillRect(getX(),getY(),30,30);
        g2d.setColor(new Color(255, 100,0));
        g2d.fillOval(getX()+5,getY()-15,35,35);
    }

    public void move(int keyCode){
        switch (keyCode) {
            case KeyEvent.VK_LEFT -> setX(getX()-10);
            case KeyEvent.VK_RIGHT -> setX(getX()+10);
            case KeyEvent.VK_UP -> jump();
            default -> Main.println("Unhandled keycode. Sorry!");
        }
    }

    public void jump() {
        jump(5);
    }

    public void jump(int gravity){
        if (isAirborne()) {
            //h(t) = v0*t - 1/2*g*t^2
            //v0=0
            //g=gravity
            //t=
//            final int time = (int) (getY() / -gravity);
            setY(getY() + speedY);
            speedY+=gravity;
        }else {
            speedY=-20;
        }
        System.out.println("SpeedY: "+speedY);
    }

    private boolean isAirborne() {
        CollidingObject object=Main.getCurrentMap().getObject(getX(),getY()+1);
        return object==null||!intersects(object);
    }

    public void update(){
        if (isAirborne()) {
            setY(getY() + speedY);
            speedY++;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "stats=" + stats +
                ", position=" + getX() + '/' + getY() +
                ", speedY=" + speedY +
                '}';
    }

    @Override
    public void onCollision(CollidingObject other) {
        if (other instanceof Enemy enemy) {
            onHit(enemy.getDamage());
        }
    }

    @Override
    public void onDeath() {

    }
}
