package ru.netology.javaqa.mymvn2.service;

public class MonthRestService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money = money + income - expenses;
            } else {
                int moneyBalance = money - expenses;
                int restMoney = moneyBalance - (money - expenses) / 3;
                money = (money - expenses) / 3;
                count++;
            }
        }
        return count;
    }
}

