package com.clothes;

public abstract class Clothes {
    private final int cost;
    private final String color;

    public Clothes(Size size, int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" + "size=" + " , " +
                "Стоимость: " + cost +
                ", Цвет: " + color +
                '}';
    }
}
