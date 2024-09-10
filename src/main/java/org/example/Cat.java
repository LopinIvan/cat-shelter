package org.example;

import java.util.Objects;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private String gender;
    private int age;
    private int id;

    public Cat() {}

    public Cat(String name, String breed, String color, String gender, int age) {
        this.name = Objects.requireNonNull(name, "Name не может быть null");
        this.gender = Objects.requireNonNull(gender, "Gender не может быть null");
        this.breed = Objects.requireNonNull(breed, "Breed не может быть null");
        this.color = Objects.requireNonNull(color, "color не может быть null");

        if (age < 0) {
            throw new IllegalArgumentException("Возраст должен быть не отрицательным");
        }

        this.age = age;
        this.id = generateUniqueId();
    }

    private int generateUniqueId() {
        int minValue = 500000;
        int maxValue = 599999;
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return id == cat.id &&
                age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(gender, cat.gender) &&
                Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name, gender, breed);
    }
}

