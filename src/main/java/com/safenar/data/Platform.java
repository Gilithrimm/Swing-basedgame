package com.safenar.data;

import java.awt.*;

public class Platform extends CollidingObject{

    public Platform(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public String toString() {
        return "Platform{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                '}';
    }
}
