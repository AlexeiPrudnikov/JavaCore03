package ru.geekbrains;

import ru.geekbrains.models.*;
import ru.geekbrains.sortmethods.SortMethods;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new HourlyEmployee("Иванов", Sex.MALE, new GregorianCalendar(1980, Calendar.APRIL, 21),Position.MANAGER, 60));
        company.addEmployee(new PermanentEmployee("Иванова", Sex.FEMALE, new GregorianCalendar(1979, Calendar.FEBRUARY, 11)));
        company.addEmployee(new PermanentEmployee("Сидоров", Sex.MALE, new GregorianCalendar(1960, Calendar.JULY, 13), Position.HEAD_OF_DEPARTMENT));
        company.addEmployee(new HourlyEmployee("Петров", Sex.MALE, new GregorianCalendar(1980, Calendar.AUGUST, 31),Position.SENIOR_MANAGER, 200));
        company.addEmployee(new HourlyEmployee("Курочкина", Sex.FEMALE, new GregorianCalendar(1973, Calendar.APRIL, 20)));
        company.addEmployee(new HourlyEmployee("Васечкин", Sex.MALE, new GregorianCalendar(1983, Calendar.SEPTEMBER, 11),Position.MANAGER, 115));
        company.addEmployee(new PermanentEmployee("Круглова", Sex.FEMALE, new GregorianCalendar(2001, Calendar.JUNE, 2),Position.SENIOR_MANAGER));
        company.addEmployee(new HourlyEmployee("Собакин", Sex.MALE, new GregorianCalendar(1992, Calendar.DECEMBER, 15),Position.SENIOR_MANAGER, 88));
        company.addEmployee(new PermanentEmployee("Кошкина", Sex.FEMALE, new GregorianCalendar(1992, Calendar.MAY, 5),Position.MANAGER));
        company.addEmployee(new PermanentEmployee("Плойкин", Sex.MALE, new GregorianCalendar(1986, Calendar.OCTOBER, 14),Position.PRIVATE));

        company.printSortEmployees(SortMethods.BY_NAME);
        System.out.println();
        company.printSortEmployees(SortMethods.BY_POSITION);
        System.out.println();
        company.printSortEmployees(SortMethods.BY_BIRTH_DATE);
        System.out.println();
        company.printSortEmployees(SortMethods.BY_INCOME);
        System.out.println();
        company.printHourlyEmployees();
        System.out.println();
        company.printPermanentEmployee();
        System.out.println();


    }
}