package com.safenar.data;

import java.awt.*;

public class Map {
    private final CollidingObject[][] objects;
    private final int width;
    private final int height;
    private final int tileSize;

    public Map(int width, int height, int tileSize) {
        this.width = width;
        this.height = height;
        this.tileSize = tileSize;
        objects = new CollidingObject[width][height];
    }

    public void addObject(CollidingObject object, int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new IllegalArgumentException("Invalid coordinates");
        }
        objects[x][y] = object;
    }

    public void removeObject(int x, int y) {
        objects[x][y] = null;
    }

    public CollidingObject getObject(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new IllegalArgumentException("Invalid coordinates");
        }
        return objects[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getTileSize() {
        return tileSize;
    }

    public boolean isColliding(CollidingObject object, int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return true;
        }
        if (objects[x][y] == null) {
            return false;
        }
        return objects[x][y].intersects(object);
    }

    public void update() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (objects[i][j] != null) {
                    objects[i][j].update();
                }
            }
        }
    }

    public void draw(Graphics graphics) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (objects[i][j] != null) {
                    objects[i][j].draw(graphics);
                }
            }
        }
    }
}
