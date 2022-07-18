package ru.netology.servise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int result = service.remain(amount);

        assertEquals(expected,result);

    }
}