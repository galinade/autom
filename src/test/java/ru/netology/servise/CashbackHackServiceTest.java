package ru.netology.servise;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;

//import static org.junit.jupiter.api.Assertions.*;


import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int amount = 800;
        int result = service.remain(amount);

        assertEquals(result,expected);

    }
}