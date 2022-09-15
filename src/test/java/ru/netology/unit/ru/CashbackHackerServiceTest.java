package ru.netology.unit.ru;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerServiceTest {
    @Test
    public void shouldCashbackHackerBelow() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 500;
        int expected = 500;
        int actual = cashbackHackerService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void  shouldCashbackHackerAbove() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 2500;
        int expected = 500;
        int actual = cashbackHackerService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHacker() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackerService.remain(amount);

        assertEquals(expected, actual);
    }
}
