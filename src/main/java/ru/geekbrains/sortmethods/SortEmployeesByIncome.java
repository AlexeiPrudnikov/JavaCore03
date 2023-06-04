package ru.geekbrains.sortmethods;

import ru.geekbrains.models.Employee;
/**
 * Класс-Comparator объектов класса Employee
 * Сравнение происходит по доходу
 */
public class SortEmployeesByIncome extends SortEmployees {
    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Сравнение происходит по убыванию
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getIncome() > o2.getIncome()) {
            return -1;
        } else if (o1.getIncome() < o2.getIncome()) {
            return 1;
        } else {
            return 0;
        }
    }
}
