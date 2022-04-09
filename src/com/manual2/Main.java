package com.manual2;

public class Main {
    public static void main(String[]args) {

        // Задание №1: Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("=============");
        System.out.println("Задание №1: ");
        int[] swapArray = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < swapArray.length; i++) {
            if (swapArray[i] == 0) {
                swapArray[i] = 1;
            } else {
                swapArray[i] = 0;
            }
            System.out.println(swapArray[i]);
        }

        // Задание №2: Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
        System.out.println("=============");
        System.out.println("Задание №2: ");
        int[] fillArray = new int[8];
        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = i + 2 * i;
            System.out.println(fillArray[i]);
        }

        // Задание №3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("=============");
        System.out.println("Задание №3: ");
        int[] doubleMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < doubleMultiply.length; i++) {
            if (doubleMultiply[i] <= 6) {
                doubleMultiply[i] = doubleMultiply[i] * 2;
            }
            System.out.println(doubleMultiply[i]);
        }

        // Задание №4: Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("=============");
        System.out.println("Задание №4: ");
        int[][] diagonalsArray = new int[4][4];
        for (int i = 0, x = 3; i < diagonalsArray.length; i++, x--) {
            for (int j = 0; j < diagonalsArray.length; j++) {
                if (i == j) {
                    diagonalsArray[i][j] = 1;
                } else if (x >= 0) {
                    diagonalsArray[i][x] = 1;
                }
                System.out.println(diagonalsArray[i][j]);
            }
        }
        // Задание №5 Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        System.out.println("=============");
        System.out.println("Задание №5: ");
        int[] minMaxArray = {5, 9, 1, 4, 15, 2};
        for (int i = 0; i < minMaxArray.length; i++) {
            int max = minMaxArray[0];
            int min = minMaxArray[0];
            if (minMaxArray[i] > max) {
                minMaxArray[i] = max;
            } else if (minMaxArray[i] < min)
                minMaxArray[i] = min;
            System.out.println("Maximum = " + max);
            System.out.println("Minimum = " + min);
        }
    }
}