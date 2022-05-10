package com.safenar;

import com.safenar.data.Map;
import com.safenar.data.Platform;
import com.safenar.data.Player;
import com.safenar.data.Stats;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener,Runnable{
    Player player=new Player(10,
            0,
                new Stats(1,1,1,1,100,100));
    Dimension size;
    Map map;
    GameLoop gameLoop;

    public MyPanel(Dimension size) {
        setBackground(Color.BLUE);
        this.size = size;
        gameLoop=new GameLoop(false);
        map = new Map(size.width,size.height,32);
        map.addObject(player,player.getX(),player.getY());
        map.addObject(new Platform(0,100,100,10),0,100);
    }

    public void addNotify() {
        super.addNotify();
        Thread thread = new Thread(this);
        thread.start();
        gameLoop.running = true;
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        Main.println("key="+e.getKeyCode());
        player.move(key);
    }

    @Override
    public void run() {
        gameLoop.run(this::repaint);
    }

    public void update(Graphics g){
        map.update();
        if(player.getX()>=size.getWidth()||player.getX()<0)
            player.setX(750);
        if (player.getY()>=size.getHeight()||player.getY()<0)
            player.setY(300);
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        update(g);
        map.draw(g);
    }
}