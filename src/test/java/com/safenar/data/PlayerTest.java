package com.safenar.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Mock
    List<Ability> abilities;

    Rectangle collisionBox=new Rectangle(0,0,2,2);
    @InjectMocks
    Player player=new Player(0,0,Stats.EMPTY);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMove_left() {
        int x=player.getX()-10;
        player.move(KeyEvent.VK_LEFT);
        assertEquals(x,player.getX());
    }

    @Test
    void testMove_right() {
        int x=player.getX()+10;
        player.move(KeyEvent.VK_RIGHT);
        assertEquals(x,player.getX());
    }

    @Test
    void testJump() {
        int y=player.getY();
        player.jump();
        assertEquals(y,player.getY());
    }

    @Test
    void testIntersects() {
        CollidingObject collidingObject=new CollidingObject(0,0,2,2);
        boolean result = player.intersects(collidingObject);

        assertTrue(result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme