package com.safenar;

import com.safenar.data.Map;

import java.awt.*;

public class Main {
    public static MyFrame frame=new MyFrame();

    public static void println(Object word) {
        System.out.println(word);
    }

    public static void main(String[] args) {
	// write your code here
        EventQueue.invokeLater(()-> frame.setVisible(true));
    }

    public static long getDeltaTime() {
        return frame.gamePanel.gameLoop.getDeltaTime();
    }

    public static Map getCurrentMap() {
        return frame.gamePanel.map;
    }
}
