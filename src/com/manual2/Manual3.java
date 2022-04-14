package com.manual2;

import java.util.Random;
import java.util.Scanner;

public class Manual3 {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иванов Иван", "Инженер", "ivanov.ivan@gmail.com", 9999999, 35000, 35);
        workers[1] = new Worker("Петров Петр", "Инженер", "petrov.petr@gmail.com", 8888888, 35000, 32);
        workers[2] = new Worker("Иванова Мария", "Бухгалтер", "ivanova.mariia@gmail.com", 7777777, 30000, 33);
        workers[3] = new Worker("Сидоров Сидр", "Охранник", "sidorov.sidr@gmail.com", 6666666, 20000, 45);
        workers[4] = new Worker("Козлов Артем", "Консультант", "kozlov.artem@gmail.com", 5555555, 25000, 28);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                workers[i].showInfo();
            }
        }
        System.out.println("==============");
        randomTask();
    }
    //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    //При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    //После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void randomTask() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int x = rand.nextInt(9);
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до 9: ");
                int a = sc.nextInt();
                    if (x == a) {                  //Действия при выйгрыше
                        System.out.println("Вы угадали!");
                        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                        a = sc.nextInt();
                        if (a == 1) {              //Хотим еще
                            x = rand.nextInt(9);
                            i = 0;
                        } else {                   //Не хотим
                            sc.close();
                            break;
                        }
                    } else if (x > a) {
                        System.out.println("Загаданное число больше");
                    } else {
                        System.out.println("Загаданное число меньше");
                    }
                    if (i == 2) {                   //Действия при проигрыше
                        System.out.println("Вы проиграли...Повторить игру еще раз? 1 – да / 0 – нет");
                        a = sc.nextInt();
                        if (a == 1) {              //Хотим еще
                            x = rand.nextInt(9);
                            i = 0;
                        } else {                   //Не хотим
                            sc.close();
                            break;
                        }
                    }
            }
    }
}

