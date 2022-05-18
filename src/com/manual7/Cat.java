package com.manual7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full = false;

    public boolean isFull() {
        return full;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (appetite > p.getFood()) {
            return;
        } else {
            p.decreaseFood(appetite);
            appetite -= appetite;
        }

        if (appetite == 0) {
            full = true;
        }
    }
}
