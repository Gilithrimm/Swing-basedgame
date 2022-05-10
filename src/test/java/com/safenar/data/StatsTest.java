package com.safenar.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsTest {
    Stats stats = Stats.EMPTY;

    @Test
    void testToString() {
        String result = stats.toString();
        Assertions.assertEquals("Stats:[ATK 0, DEF 0, SPD 0, HP 0/0, MP 0/0]", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme