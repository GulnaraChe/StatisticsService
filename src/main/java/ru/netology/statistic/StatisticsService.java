package ru.netology.statistic;

public class StatisticsService {
    /*        public long findMax(long[] incomes) {
                long currentMax = incomes[0];
                for (long income : incomes) {
                    if (currentMax < income) {
                        currentMax = income;
                    }
                }
                return currentMax;
            }*/
    public long findMax(long[] incomes) {
        long maxValue = incomes[0];
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] > maxValue) {
                maxValue = incomes[i];
            }
        }
        return maxValue;
    }
}