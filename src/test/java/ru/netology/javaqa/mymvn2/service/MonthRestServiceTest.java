package ru.netology.javaqa.mymvn2.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MonthRestServiceTest {

    @Test
    public void monthRestInYear() {
        MonthRestService service = new MonthRestService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthRestInYear2() {
        MonthRestService service = new MonthRestService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}








