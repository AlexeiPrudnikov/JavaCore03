package ru.geekbrains.sortmethods;

import ru.geekbrains.models.Employee;
/**
 * Класс-Comparator объектов класса Employee
 * Сравнение происходит по имени
 */
public class SortEmployeesByName extends SortEmployees{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
