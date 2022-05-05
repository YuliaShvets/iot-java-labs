package ua.lviv.iot.manager;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.*;

import java.util.ArrayList;
import java.util.List;


class ZooTest {

    private Zoo zoo;
    private Bird birds;
    private Nightingale nightingale;
    private Peafowl peafowl;
    private Stork stork;
    private Swallow swallow;
    private Swan swan;

    @BeforeEach
    void setUp() {
        Swan swan = new Swan("Cygnus atratus", "black", 7, 65.5, 3, 15, false, "Cygnus atratus");
        Peafowl peafowl = new Peafowl("Indian Peafowl", "Green", 5, 15, 8, 20, false, "Indian Peafowl");
        Swallow swallow = new Swallow("Swallow", "black and white", 0.13, 55, 0.379, 4, true, "Swallow");
        Nightingale nightingale = new Nightingale("Nightingale", "grey", 0.1, 60, 0.4, 5, true, "Nightingale");
        Stork stork = new Stork("Stork", "white", 3.1, 45, 3.5, 9, true, "Stork");
        zoo = new Zoo();
        zoo.addBirds();
        zoo.foundBirds();


    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void testAddBirds() {
        List<Bird> expected = new ArrayList<>();
        expected.add(swan);
        expected.add(peafowl);
        expected.add(swallow);
        expected.add(nightingale);
        expected.add(stork);

        List<Bird> actual = new ArrayList<>();
        actual.add(swan);
        actual.add(peafowl);
        actual.add(swallow);
        actual.add(nightingale);
        actual.add(stork);
        Assert.assertEquals(expected, actual);


    }

    @Test
    void testSortByWeightAsc() {
        var result = zoo.sortByWeightAsc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Nightingale", result.get(0).getName());
        Assertions.assertEquals("Swallow", result.get(1).getName());
        Assertions.assertEquals("Stork", result.get(2).getName());

    }

    @Test
    void testSortByWeightDesc() {
        var result = zoo.sortByWeightDesc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Stork", result.get(0).getName());
        Assertions.assertEquals("Swallow", result.get(1).getName());
        Assertions.assertEquals("Nightingale", result.get(2).getName());

    }

    @Test
    void testSortByFeedAsc() {
        var result = zoo.sortByFeedAsc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Swallow", result.get(0).getName());
        Assertions.assertEquals("Nightingale", result.get(1).getName());
        Assertions.assertEquals("Stork", result.get(2).getName());

    }

    @Test
    void testSortByFeedDesc() {
        var result = zoo.sortByFeedDesc();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Stork", result.get(0).getName());
        Assertions.assertEquals("Nightingale", result.get(1).getName());
        Assertions.assertEquals("Swallow", result.get(2).getName());

    }

}