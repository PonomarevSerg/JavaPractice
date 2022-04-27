package com.manual6;

import static com.manual6.Animal.count;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Персик");
        cat1.swim(150);
        Animal dog1 = new Dog("Тузик");
        dog1.swim(11);
        dog1.run(300);
        cat1.run(150);
        cat1.run(250);
        System.out.println(count);
        Animal cat2 = new Cat("Барсик");
        System.out.println(count);
    }
}
