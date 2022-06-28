package com.team;

public class Dolphin extends Animal implements Swimable, Jumpable {
    @Override
    public boolean swim(int distance) {
        return swimLimit() - distance < 0;
    }

    @Override
    public int swimLimit() {
        return 150;
    }

    @Override
    public boolean jump(double height) {
        return heightLimit() - height < 0;
    }

    @Override
    public double heightLimit() {
        return 0.5;
    }
}
