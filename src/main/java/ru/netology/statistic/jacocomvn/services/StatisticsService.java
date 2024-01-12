package ru.netology.statistic.jacocomvn.services;

public class StatisticsService {

    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes) {
            if (currentMin > income) {
                currentMin = income;
            }
        }
        return currentMin;
    }

    public long sum(long[] incomes) {
        long currentSum = 0;
        for (long income : incomes) {
            currentSum += income;
        }
        return currentSum;
    }

    public long average(long[] incomes) {
        long currentAverage = 0;
        for (long income : incomes) {
            currentAverage += income;
        }
        long averageIncome = currentAverage / 11;
        return averageIncome;
    }

    public int calcNumberMoreAverage(long[] incomes) {
        int count = 0;
        long averageIncome = average(incomes);
        for (long income : incomes) {
            if (income > averageIncome) {
                count++;
            }
        }
        return count;


    }


    public int calcNumberBelowAverage(long[] incomes) {
        int count = 0;
        long averageIncome = average(incomes);
        for (long income : incomes) {
            if (income < averageIncome) {
                count++;
            }
        }
        return count;
    }


    public long calcPercent(long[] incomes) {
        long currentPercent = 0;
        long percent = 5;
        for (long income : incomes) {
            currentPercent += income;
        }
        long percentIncome = currentPercent * percent /100;
        return percentIncome;
    }









}






