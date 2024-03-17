package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationPlannerTest {

    @Test
    public void testCalculateVacationMonths() {
        VacationPlanner planner = new VacationPlanner();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = planner.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}