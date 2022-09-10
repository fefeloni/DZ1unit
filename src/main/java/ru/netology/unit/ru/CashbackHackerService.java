package ru.netology.unit.ru;

public class CashbackHackerService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
    }
