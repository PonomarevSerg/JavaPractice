package com.clothes;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Size.XXS);

        Clothes[] clothes = new Clothes[20];

        clothes[0] = new Skirt(Size.XXS, 1000, "Blue");
        clothes[1] = new Pants(Size.S, 1500, "Red");
        clothes[2] = new Shirt(Size.L, 500, "White");
        clothes[3] = new Tie(Size.M, 1200, "Black");

        Atelier atelier = new Atelier();

        atelier.dressMen(clothes);

    }
}
