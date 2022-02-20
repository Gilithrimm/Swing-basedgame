package com.safenar;

import com.safenar.data.Player;
import com.safenar.data.Stats;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener,Runnable{
    Player player=new Player(10,200, new Stats(1,1,1));
    Dimension size;
    private boolean running;

    public MyPanel(Dimension size) {
        setBackground(Color.BLUE);
        this.size = size;
    }

    public Player getPlayer() {
        return player;
    }

    public void addNotify() {
        super.addNotify();
        Thread thread = new Thread(this);
        thread.start();
        running = true;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        Main.println("key="+e.getKeyCode());
        player.move(key);
    }
    @Override
    public void run() {
        while (running) {
            long start = System.currentTimeMillis();
            System.out.println("start = " + start);
            long elapsed = System.currentTimeMillis() - start;
            System.out.println("elapsed = " + elapsed);
            int FPS = 60;
            long targetTime = 1000 / FPS;
            long wait = targetTime - elapsed / 1000000;
            if (wait < 0 ) wait = 5;
            System.out.println("wait = " + wait);
            try {
                Thread.sleep(wait);
            } catch (Exception e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public void update(Graphics g){
        getPlayer().draw(g);
        if(getPlayer().getPosX()>=size.getWidth()||getPlayer().getPosX()<0) getPlayer().setPosX(750);
        if (getPlayer().getPosY()>=size.getHeight()||getPlayer().getPosY()<0) getPlayer().setPosY(300);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        update(g);
    }


}
