package com.team;

public class Wall implements Obstacle{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Animal animal) {
        return animal.jump(height);
    }
}
