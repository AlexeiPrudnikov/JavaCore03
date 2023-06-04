package ru.geekbrains.models;

/**
 * Перечисление полов, в качестве значения - наименование на русском языке
 */
public enum Sex {
    MALE("Мужской"),
    FEMALE("Женский");
    private String value;
    public String getValue(){
        return value;
    }
    Sex(String value){
        this.value = value;
    }
}
