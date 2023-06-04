package ru.geekbrains.models;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Абстрактный класс работника
 */
public abstract class Employee implements Comparable<Employee>, IIncome {
    /**
     * Поле имя
     */
    private String name;
    /**
     * Поле пол
     */
    private Sex sex;
    /**
     * Поле дата рождения
     */
    private Calendar birthDate;
    /**
     * Поле должность
     */
    private Position position;

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }


    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getStringBirthDate() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return df.format(getBirthDate().getTime());
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Employee(String name) {
        this(name, Sex.MALE);
    }

    public Employee(String name, Sex sex) {
        this(name, sex, new GregorianCalendar(2000, Calendar.JANUARY, 01));
    }

    public Employee(String name, Sex sex, Calendar birthDate) {
        this(name, sex, birthDate, Position.PRIVATE);
    }

    public Employee(String name, Sex sex, Calendar birthDate, Position position) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.position = position;
    }

    /**
     * Спавнение экземпляров класса
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        if (name.equals(employee.getName()) &&
                sex == employee.getSex() &&
                birthDate.compareTo(employee.getBirthDate()) == 0 &&
        this.getClass() == employee.getClass()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Employee o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return String.format("%s, пол: %s, дата рождения: %s, должность: %s, доход: %.2f",
                name,
                sex.getValue(),
                getStringBirthDate(),
                position,
                getIncome());
    }
}
