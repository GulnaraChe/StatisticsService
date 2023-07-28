package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

public class StatistiscServiceTest {

    @Test
    void findMaxTest() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 50, 8, 6, 11, 11, 12};
        long expected = 50;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}