package com.manual7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        if (n > food) {
            return;
        } else {
            food -= n;
        }
    }

    public void increaseFood(int num) {
        food += num;
    }
}
