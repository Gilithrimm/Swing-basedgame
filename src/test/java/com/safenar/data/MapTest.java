package com.safenar.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
    //Field objects of type CollidingObject[] - was not mocked since Mockito doesn't mock arrays
    Map map = new Map(10, 10, 32);

    @BeforeEach
    void setUp() {
        map.addObject(new CollidingObject(0, 0, 5, 5), 0, 0);
    }

    @Test
    void testAddObject() {
        map.addObject(new CollidingObject(1, 4, 7, 7), 0, 0);
    }

    @Test
    void testRemoveObject() {
        map.removeObject(0, 0);
    }

    @Test
    void testGetObject() {
        CollidingObject result = map.getObject(0, 0);
        assertEquals(new CollidingObject(0, 0, 5, 5), result);
    }

    @Test
    void testIsColliding() {
        boolean result = map.isColliding(new CollidingObject(0, 0, 2, 2), 0, 0);
        assertTrue(result);
    }

    @Test
    void testIsColliding_asPlayer() {
        Player player = new Player(0, 0, Stats.EMPTY);
        boolean result = map.isColliding(player, 1, 1);
        assertFalse(result);
    }

    @Test
    void testUpdate() {
        map.update();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme