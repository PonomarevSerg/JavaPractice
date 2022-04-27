package com.manual6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать.");
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Кот " + name + " не может пробежать более 200 метров, введите корректное значение.");
        } else if (distance < 0) {
            System.out.println("Введите положительное значение.");
        } else {
            System.out.println("Кот " + name + " пробежал " + distance + " метров.");
        }
    }
}