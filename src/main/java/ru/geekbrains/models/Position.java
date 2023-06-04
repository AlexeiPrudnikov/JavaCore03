package ru.geekbrains.models;

/**
 * Перечисление должностей, в качестве значения - оклад
 */
public enum Position {
    PRIVATE(1000),
    MANAGER(2000),
    SENIOR_MANAGER(2500),
    HEAD_OF_DEPARTMENT(4000);
    private int value;
    Position(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }

}
