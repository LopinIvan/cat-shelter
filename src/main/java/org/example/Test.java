package org.example;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        CatManager manager = new CatManager();

        //создание объекта Cat, параметры - Имя, Порода, Цвет, Пол, Возраст

        Cat barsik = new Cat("Barsik", "Scotland", "Ginger", "Mail", 5);

        manager.addCat("Barsik", barsik);

        try {

            manager.saveMap();

            manager.loadMap();

            Cat loadedBarsik = manager.getCat("Barsik");
            System.out.println("Идентификатор: " + loadedBarsik.getId());
            System.out.println("Имя кошки: " + loadedBarsik.getName());
            System.out.println("Порода кошки: " + loadedBarsik.getBreed());
            System.out.println("Цвет кошки: " + loadedBarsik.getColor());
            System.out.println("Пол кошки: " + loadedBarsik.getGender());
            System.out.println("Возраст кошки: " + loadedBarsik.getAge());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}