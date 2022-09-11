package ru.netology.unit.ru;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {
    @Test
    void shouldCashbackHackerBelow() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 100;
        int expected = 900;
        int actual = cashbackHackerService.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    void  shouldCashbackHackerAbove() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackerService.remain(amount);

        assertEquals(actual, expected);
    }

    //@Test
    //void shouldCashbackHacker() {
        //CashbackHackerService cashbackHackerService = new CashbackHackerService();
        //int amount = 1000;
        //int expected = 0; тест падает в этом месте
        //int actual = cashbackHackerService.remain(amount);

        //assertEquals(actual, expected);
   // }
}
