package com.manual7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5);
        Plate plate = new Plate(100);
        plate.info();
        System.out.println(cat.isFull());
        System.out.println(cat.getAppetite());
        cat.eat(plate);
        System.out.println(cat.getAppetite());
        System.out.println(cat.isFull());

        Cat[] cats = {new Cat("Рыжик", 3),
                new Cat("Хвостик", 6),
                new Cat("Саныч", 4)};
        Plate plate1 = new Plate(10);
        for (Cat cat1 : cats) {
            cat1.eat(plate1);
            cat1.isFull();
            System.out.println(cat1.isFull());
        }
    }
}
