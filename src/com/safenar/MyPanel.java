package com.safenar;

import com.safenar.data.Player;
import com.safenar.data.Stats;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener{
    Player player=new Player(10,10, new Stats(1,1,1));
    Dimension size;

    public MyPanel(Dimension size) {
        setBackground(Color.BLUE);
        this.size = size;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        Main.println("key="+e.getKeyChar());
        player.move(key);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void paint(Graphics g) {
//        super.paint(g);
//        Graphics2D g2d=(Graphics2D) g;
//
//        g2d.setColor(new Color(255,175,0));
//        g2d.fillRect(getPlayer().getPosX(),getPlayer().getPosY(),30,30);
//        g2d.setColor(new Color(255, 100,0));
//        g2d.fillOval(getPlayer().getPosX()+5,getPlayer().getPosY()-15,35,35);
//        if(getPlayer().getPosX()>=size.getWidth()||getPlayer().getPosX()<0){
//            getPlayer().setPosX(750);
//        }
//        if (getPlayer().getPosY()>=size.getHeight()||getPlayer().getPosY()<0){
//            getPlayer().setPosY(300);
//        }
//        Main.println(getPlayer().getPosX());
//        Main.println(getPlayer().getPosY());
//        Main.println(getPlayer().getStats());
//        Main.println(getPlayer().getStats().toString());
//        Main.println(size.toString());
    }
}
