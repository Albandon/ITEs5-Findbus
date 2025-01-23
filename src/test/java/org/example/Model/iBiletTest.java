package org.example.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class iBiletTest {

    @Test
    void getZnizka() {
        var Bilet = new BiletNormalny(900,1,3.20f);
        var uBilet = new BiletUlgowy(900,2,3.20f,20);
        assertAll(
                ()->assertEquals(0,Bilet.getZnizka()),
                ()->assertEquals(20,uBilet.getZnizka())
        );
        assertEquals(0,Bilet.getZnizka());

    }

    @Test
    void testEquals() {
    }
}