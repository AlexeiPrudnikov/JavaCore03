package ru.geekbrains.models;

import java.util.Calendar;

/**
 * Класс постоянного работника
 */
public class PermanentEmployee extends Employee{
    public PermanentEmployee(String name) {
        super(name);
    }

    public PermanentEmployee(String name, Sex sex) {
        super(name, sex);
    }

    public PermanentEmployee(String name, Sex sex, Calendar birthDate) {
        super(name, sex, birthDate);
    }

    public PermanentEmployee(String name, Sex sex, Calendar birthDate, Position position) {
        super(name, sex, birthDate, position);
    }

    /**
     * Метод подсчета дохода
     * @return Доход работника
     */
    @Override
    public double getIncome() {
        return getPosition().getValue();
    }
}
