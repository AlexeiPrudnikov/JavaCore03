package ru.geekbrains.models;

import ru.geekbrains.sortmethods.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Company - содержит список сотруудников
 */
public class Company {
    public List<Employee> getEmployees() {
        return employees;
    }

    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public Company() {
        employees = new ArrayList<>();
    }

    /**
     * Печатает сотрудников с почасовой оплатой
     */
    public void printHourlyEmployees(){
        for (Employee employee:employees) {
            if (employee instanceof  HourlyEmployee) {
                System.out.println(employee.toString());
            }
        }
    }
    /**
     * Печатает сотрудников с постоянным окладом
     */
    public void printPermanentEmployee(){
        for (Employee employee:employees) {
            if (employee instanceof  PermanentEmployee) {
                System.out.println(employee.toString());
            }
        }
    }

    /**
     * Добавляет сотрудника с проверкой на существование
     * @param employee Сотрудник, которого надо добавить
     */
    public void addEmployee(Employee employee){
        if (!employees.contains(employee)){
            employees.add(employee);
        } else {
            System.out.println("Ошибка, пользователь существует");
        }
    }
    /**
     * Удаляет сотрудника с проверкой на существование
     * @param employee Сотрудник, которого надо удалить
     */
    public void delEmployee(Employee employee){
        if (employees.contains(employee)){
            int index = employees.indexOf(employee);
            employees.remove(index);
            System.out.println("Пользователь удален");
        } else {
            System.out.println("Ошибка, пользователя не существует");
        }
    }

    /**
     * Сортирует и выводит список сотрудников
     * @param sortMethod Метод сортировки
     */
    public void printSortEmployees(SortMethods sortMethod){
        if (sortMethod != null){
            SortEmployees sortEmployees;
            switch (sortMethod){
                case BY_NAME:
                    sortEmployees = new SortEmployeesByName();
                    break;
                case BY_INCOME:
                    sortEmployees = new SortEmployeesByIncome();
                    break;
                case BY_BIRTH_DATE:
                    sortEmployees = new SortEmployeesByBirthDate();
                    break;
                case BY_POSITION:
                    sortEmployees = new SortEmployeeByPosition();
                    break;
                default:
                    sortEmployees = new SortEmployeesByName();
                    break;
            }
            employees.sort(sortEmployees);
            for (Employee employee:employees) {
                System.out.println(employee.toString());
            }
        } else{
            System.out.println("Метод сортировки не задан");
        }
    }
}
