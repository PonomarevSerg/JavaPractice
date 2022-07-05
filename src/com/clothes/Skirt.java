package com.clothes;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
    }
}
