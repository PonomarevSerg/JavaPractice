package com.clothes;

public class Tie extends Clothes implements MenClothes {

    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
    }

}
