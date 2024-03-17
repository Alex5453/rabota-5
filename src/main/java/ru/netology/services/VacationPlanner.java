package ru.netology.services;

public class VacationPlanner {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int restMonths = 0;
        int money = 0;

        for (int i = 1; i <= 12; i++) {
            if (money < threshold) {
                money += income - expenses;
                if (money < 0) {
                    money *= 3;
                    restMonths++;
                }
            } else {
                money += income - expenses;
            }
        }

        return restMonths;
    }
}