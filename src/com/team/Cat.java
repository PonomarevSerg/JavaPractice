package com.team;

public class Cat extends Animal implements Jumpable, Swimable {
    @Override
    public int swimLimit() {
        return 20;
    }

    @Override
    public boolean swim(int distance) {
        return swimLimit() - distance < 0;
    }

    @Override
    public boolean jump(double height) {
        return heightLimit() - height < 0;
    }

    @Override
    public double heightLimit() {
        return 1.5;
    }
}
