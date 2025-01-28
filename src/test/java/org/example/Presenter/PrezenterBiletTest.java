package org.example.Presenter;

import org.example.Model.BiletNormalny;
import org.example.Model.BiletUlgowy;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;
@Tag("Control")
@TestMethodOrder(OrderAnnotation.class)
class PrezenterBiletTest{
    static PrezenterBilet Prezenter;

    @BeforeAll
    static void setUp() {
        Prezenter = new PrezenterBilet();
    }

    @Test
    @Order(5)
    void removeBiletTest() {
        assertAll (
                ()->assertTrue(Prezenter.removeBilet(1)),
                ()->assertFalse(Prezenter.removeBilet(2))
        );
        assertFalse(Prezenter.removeBilet(1));
    }

    @ParameterizedTest
    @CsvSource({"0, 10", "1,20", "2, 30", "3, 40"})
    @Order(1)
    void createBiletUlgowyTest(int id, int discount) {
        var bilet = Prezenter.createBilet(900,id,3.20f,discount);
        assertInstanceOf(BiletUlgowy.class, bilet);
    }


    @ParameterizedTest
    @CsvSource({"0, -10", "1,100", "2, -1"})
    @Order(1)
    void createBiletExceptionTest(int id, int discount) {
        var expected = assertThrows(
                IllegalArgumentException.class,
                () -> Prezenter.createBilet(900,id,3.20f,discount)
        );
        System.out.println(expected.getMessage());
    }


    @Tag ("Create")
    @ParameterizedTest
    @ValueSource(ints = {4,5,6,7,8,9})
    @Order(2)
    void createBiletNormalnyTest(int id) {
        var bilet = Prezenter.createBilet(900,id,3.20f,0);
        assertInstanceOf(BiletNormalny.class, bilet);
    }

    @Test
    @Tag("Add")
    @Order(3)
    void addBiletTest() {
        Prezenter.addBilet(Prezenter.createBilet(900,1,3,2));
        assertEquals(Prezenter.createBilet(900,1,3,2), Prezenter.getBilet(1));
    }

    @Test
    @Tag("Get")
    @Order(4)
    void getBiletTest() {
        Prezenter.addBilet(Prezenter.createBilet(900,1,3,2));
        assertEquals(Prezenter.createBilet(900,1,3,2),Prezenter.getBilet(1));
    }

    @Test
    @Tag("Get")
    @Order(4)
    void getNoBiletTest() {
        assertNull(Prezenter.getBilet(10));
    }

}