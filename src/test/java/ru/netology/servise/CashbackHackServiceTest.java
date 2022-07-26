package ru.netology.servise;
import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 90;
        int amount = 910;
        int result = service.remain(amount);

        assertEquals(expected,result);

    }
    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 1000;
        int result = service.remain(amount);

        assertEquals(expected,result);

    }
    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 1900;
        int result = service.remain(amount);

        assertEquals(expected,result);

    }
    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int result = service.remain(amount);

        assertEquals(expected,result);

    }
    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 0;
        int result = service.remain(amount);

        assertEquals(expected,result);

    }

}