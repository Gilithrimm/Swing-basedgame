package com.safenar.data;

import java.awt.*;

public class Enemy extends Entity {
    public Enemy(Rectangle collisionBox, Stats stats) {
        super(collisionBox, stats);
    }

    @Override
    public void onCollision(CollidingObject other) {

    }

    @Override
    public void onDeath() {

    }

    public int getDamage() {
        return random.nextInt(getLuck()/2)+getAttack();
    }
}
