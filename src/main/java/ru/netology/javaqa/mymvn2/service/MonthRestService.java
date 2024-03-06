package ru.netology.javaqa.mymvn2.service;

public class MonthRestService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха

        for (int month = 0; month < 12; month++) {
            if (threshold >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = (threshold - expenses) / 3;
            } else {
                threshold = threshold + income - expenses;
            }
        }
        return count;
    }
}
