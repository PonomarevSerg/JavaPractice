package com.clothes;

public class Shirt extends Clothes implements MenClothes, WomenClothes {

    public Shirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
    }

    @Override
    public void dressMen() {

    }
}
