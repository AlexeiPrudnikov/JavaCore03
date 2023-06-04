package ru.geekbrains.models;

import java.util.Calendar;

/**
 * Класс работника с почасовой оплатой
 */
public class HourlyEmployee extends Employee {
    /**
     * Количество отработанных часов
     */
    private int workingHours = 0;

    public HourlyEmployee(String name) {
        super(name);
    }

    public HourlyEmployee(String name, Sex sex) {
        super(name, sex);
    }

    public HourlyEmployee(String name, Sex sex, Calendar birthDate) {
        super(name, sex, birthDate);
    }

    public HourlyEmployee(String name, Sex sex, Calendar birthDate, Position position) {
        super(name, sex, birthDate, position);
    }

    public HourlyEmployee(String name, Sex sex, Calendar birthDate, Position position, int workingHours) {
        super(name, sex, birthDate, position);
        this.workingHours = workingHours;
    }

    /**
     * Метод подсчета дохода
     * @return Доход работника
     */
    @Override
    public double getIncome() {
        return workingHours * ((double)getPosition().getValue() /(20 * 8));
    }

    /**
     * Метод добавления рабочих часов
     * @param hours количество отработанных часов
     */
    public void addHours(int hours){
        workingHours += hours;
    }

    /**
     * Метод обнуления отработанных часов
     */

    public void clearHourse(){
        workingHours = 0;
    }
}
