package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CatManager manager = new CatManager();

        Cat barsik = new Cat("Barsik", "Scotland", "Male", 5);

        manager.addCat("Barsik", barsik);

        try {
            manager.saveMap();

            manager.loadMap();

            Cat loadedBarsik = manager.getCat("Barsik");
            System.out.println("Имя кошки: " + loadedBarsik.getName());
            System.out.println("Порода кошки: " + loadedBarsik.getBreed());
            System.out.println("Пол кошки: " + loadedBarsik.getGender());
            System.out.println("Возраст кошки: " + loadedBarsik.getAge());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}