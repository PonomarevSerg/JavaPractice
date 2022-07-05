package com.clothes;

public class Pants extends Clothes implements MenClothes, WomenClothes {

    @Override
    public void dressWomen() {
    }

    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {

    }


}
