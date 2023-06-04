package ru.geekbrains.sortmethods;

import ru.geekbrains.models.Employee;
/**
 * Класс-Comparator объектов класса Employee
 * Сравнение происходит по должности
 */
public class SortEmployeeByPosition extends SortEmployees{
    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Сравнение происходит по убыванию
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getPosition().getValue() - o1.getPosition().getValue();
    }
}
