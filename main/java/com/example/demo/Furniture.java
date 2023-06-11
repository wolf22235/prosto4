package com.example.demo;

import lombok.Getter; //Getter - это метод, с помощью которого получают (считывают) значение переменной
public class Furniture {
    @Getter private String furniture; //Название игры
    @Getter private String produced; //Разработчики
    @Getter private String color; //Жанр
    @Getter private float width;//Год выпуска
    @Getter private float height;//Оценка

    public Furniture(String furniture, String produced, String color, float width, float height) {
        this.furniture = furniture; //this - используется для ссылки на текущий класс с учетом метода
        this.produced = produced;
        this.color = color;
        this.width = width;
        this.height = height;
    }
    @Override
    public boolean equals(Object obj) { //Указывает, равен ли какой-либо другой объект этому объекту. Метод equals реализует отношение эквивалентности для ненулевых ссылок на объекты
        if(this==obj) return true; //Сравниваем ссылки
        if(obj==null || getClass()!=obj.getClass()) return false; //Проверка
        Furniture furnitures = (Furniture) obj; //Новый объект
        if(!furniture.equals(furnitures.furniture)) return false;//Проверка с параметром
        if(!produced.equals(furnitures.produced)) return false;
        if(!color.equals(furnitures.color)) return false;
        if(width != furnitures.width) return false;
        return height == furnitures.height; //Возвращаем параметр

    }
    @Override
    public int hashCode() {
        int result = (int) ((int)height ^ ((int)height >>> 32)); //вычисление целочисленное значение с логическим сдвигом вправо
        result = 31 * result + furniture.hashCode(); //вычисление целочисленное значение для конкретного элемента класса
        result = 31 * result + produced.hashCode(); //вычисление целочисленное значение для конкретного элемента класса
        result = 31 * result + color.hashCode(); //вычисление целочисленное значение для конкретного элемента класса
        result = 31 * result + (int) width; //вычисление целочисленное значение
        return result; //Возвращаем результат
    }
}