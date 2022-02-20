package com.safenar;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel gamePanel;

    public MyFrame() throws HeadlessException {
        super("Gra Swing");
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        gamePanel=new MyPanel(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize());
        add(gamePanel);
        addKeyListener(gamePanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
