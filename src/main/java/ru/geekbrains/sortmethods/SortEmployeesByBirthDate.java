package ru.geekbrains.sortmethods;

import ru.geekbrains.models.Employee;

import java.util.Comparator;
/**
 * Класс-Comparator объектов класса Employee
 * Сравнение происходит по дате рождения
 */
public class SortEmployeesByBirthDate extends SortEmployees {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getBirthDate().before(o2.getBirthDate())) return -1;
        if(o1.getBirthDate().after(o2.getBirthDate())) return 1;
        return 0;
    }
}
