package com.team;

public class Pool implements Obstacle {
    private int distance;

    public Pool(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean doIt(Animal animal) {
        return animal.swim(distance);
    }
}
