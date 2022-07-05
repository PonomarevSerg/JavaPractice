package com.clothes;

public class Atelier {

    public void dressMen(Clothes[] clothes) {
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof MenClothes) {
                System.out.println(clothes1);
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        for (Clothes clothes2 : clothes) {
            if (clothes2 instanceof WomenClothes) {
                System.out.println(clothes2);
            }
            return;
        }
    }
}
