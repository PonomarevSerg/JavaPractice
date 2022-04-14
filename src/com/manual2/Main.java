package com.manual2;

public class Main {
    public static void main(String[]args) {
        task6();
        /*
        task5();
        task3();
        task4();
        task2();
        task1();
        */
    }
    // Задание №1: Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void task1() {
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
    }

    // Задание №2: Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    private static void task2() {
        System.out.println("=============");
        System.out.println("Задание №2: ");
        int[] fillArray = new int[8];
        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = i + 2 * i;
            System.out.println(fillArray[i]);
        }
    }

    // Задание №3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void task3() {
        System.out.println("=============");
        System.out.println("Задание №3: ");
        int[] doubleMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < doubleMultiply.length; i++) {
            if (doubleMultiply[i] <= 6) {
                doubleMultiply[i] = doubleMultiply[i] * 2;
            }
            System.out.println(doubleMultiply[i]);
        }
    }
    // Задание №4: Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void task4() {
        System.out.println("=============");
        System.out.println("Задание №4: ");
        int[][] diagonalsArray = new int[4][4];

        for (int i = 0; i < diagonalsArray.length; i++) {
            diagonalsArray[i][i] = 1;
            diagonalsArray[diagonalsArray.length - i - 1][i] = 1;
        }
    }
    // Задание №5 Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    private static void task5() {
        System.out.println("=============");
        System.out.println("Задание №5: ");
        int[] minMaxArray = {5, 9, 1, -5, 4, 15, 2};

        int max = minMaxArray[0];
        int min = minMaxArray[0];

        for (int i = 1; i < minMaxArray.length; i++) {
            if (minMaxArray[i] > max) {
               max = minMaxArray[i];
            } else if (minMaxArray[i] < min) {
                min = minMaxArray[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    /**
     * Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
     * вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) →
     * true, граница показана символами ||, эти символы в массив не входят.
     */
    private static boolean task6() {
        int[] arr = {1, 1, 1, 2, 1};

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            //left side
            for (int j = 0; j <= i; j++) {
                leftSum += arr[j];
            }

            //right side
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return true;
            }

        }
        return false;
    }
}