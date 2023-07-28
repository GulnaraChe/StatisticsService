package ru.netology.statistic;

import java.util.Arrays;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long maxValue = incomes[0];
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] > maxValue) {
                maxValue = incomes[i];
            }
        }
        return maxValue;
    }

    public void Main() {
        long[] incomesInBillions = {};
        StatisticsService service = new StatisticsService();
        System.out.print("Доход в милионах по месяцам");
        System.out.println(Arrays.toString(incomesInBillions));
        long max = service.findMax(incomesInBillions);
        System.out.print("Самое большое из всего:");
        System.out.println(max);
    }
}
