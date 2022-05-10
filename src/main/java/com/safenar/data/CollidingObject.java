package com.safenar.data;

import java.awt.*;
import java.util.Objects;

public class CollidingObject {
    private int x;
    private int y;
    private int width;
    private int height;
    private Rectangle collisionBox;

    public CollidingObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        collisionBox = new Rectangle(x, y, width, height);
    }

    public CollidingObject(Rectangle collisionBox) {
        this.collisionBox = collisionBox;
        x=collisionBox.x;
        y=collisionBox.y;
        width=collisionBox.width;
        height=collisionBox.height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle getCollisionBox() {
        return collisionBox;
    }

    public void setX(int x) {
        this.x = x;
        collisionBox.setLocation(x, y);
    }

    public void setY(int y) {
        this.y = y;
        collisionBox.setLocation(x, y);
    }

    public void setWidth(int width) {
        this.width = width;
        collisionBox.setSize(width, height);
    }

    public void setHeight(int height) {
        this.height = height;
        collisionBox.setSize(width, height);
    }

    public void setCollisionBox(Rectangle collisionBox) {
        this.collisionBox = collisionBox;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
        collisionBox.setLocation(x, y);
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
        collisionBox.setSize(width, height);
    }

    public void setBounds(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        collisionBox.setBounds(x, y, width, height);
    }

    public boolean intersects(CollidingObject other) {
        boolean intersects = collisionBox.intersects(other.collisionBox);
        System.out.println(collisionBox.height);
        System.out.println(other.collisionBox.height);
        if (intersects) {
            System.out.println("Collision!");
            System.out.println(this+"collides with "+other);
        }
        return intersects;
    }

    public void draw(Graphics g) {

    }

    public void update() {

    }

    @Override
    public String toString() {
        return "CollidingObject{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", collisionBox=" + collisionBox +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollidingObject object)) return false;
        return getX() == object.getX() && getY() == object.getY() && getWidth() == object.getWidth() && getHeight() == object.getHeight() && Objects.equals(getCollisionBox(), object.getCollisionBox());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getWidth(), getHeight(), getCollisionBox());
    }
}
