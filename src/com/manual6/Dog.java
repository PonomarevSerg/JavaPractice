package com.manual6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака " + name + " не может проплыть более 10 метров, введите корректное значение.");
        } else if (distance < 0) {
            System.out.println("Введите положительное значение.");
        } else {
            System.out.println("Собака " + name + " проплыл " + distance + " метров.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака " + name + " не может пробежать более 500 метров, введите корректное значение.");
        } else if (distance < 0) {
            System.out.println("Введите положительное значение.");
        } else {
            System.out.println("Собака " + name + " пробежал " + distance + " метров.");
        }
    }
}
