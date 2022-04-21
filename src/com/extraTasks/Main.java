package com.extraTasks;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // shiftArr();
        // guess();
        // randomTask();
    }
    //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным)
    //при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    //Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    //Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    //[ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    //При каком n в какую сторону сдвиг можете выбирать сами.
    public static void shiftArr() {
        int[] shiftingArr = {5, 1, 2, 3, 4};
        int n = -1;
        int memory = shiftingArr[0];
        for (int i = 1; i < shiftingArr.length; i++) {
            shiftingArr[i + n] = shiftingArr[i];
        }
        shiftingArr[4] = memory;
        for (int num : shiftingArr) {
            System.out.println(num);
        }
    }
    //Создать массив из слов
    //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    //сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
    //Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
    //apple – загаданное
    //apricot - ответ игрока
    //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //Угаданные в прошлые ответы буквы запоминать не надо.
    //То есть при следующем ответе: carpet (ковер, не фрукт, но это всего лишь пример), будет выведено:
    //####e##########
    //
    //Для сравнения двух слов посимвольно можно пользоваться:
    //String str = "apple";
    //char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    //Играем до тех пор, пока игрок не отгадает слово.
    //Используем только буквы в нижнем регистре.
    public static void guess() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int random = rand.nextInt(words.length);
        Scanner scanner = new Scanner(System.in);

        do {
            String answer = words[random];
            String guess = scanner.nextLine();
            for (int i = 0; i < 15 - answer.length(); i++) {
                for (int j = 0; j < answer.length(); j++) {
                    if (guess.charAt(i) == answer.charAt(j)) {
                        System.out.print(answer.charAt(j));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.print("#");
            }
        }
        while (true);
    }

    public static void randomTask() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guess = rand.nextInt(9);
        boolean game = true;
        int attempts = 3;
        do {
            System.out.println("Введите число от 0 до 9: ");
            int version = sc.nextInt();
            if (guess == version) {
                System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                version = sc.nextInt();
                if (version == 0) {
                    break;
                } else if (version == 1) {
                    guess = rand.nextInt(9);
                    attempts = 3;
                } else {
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                }
            } else if (guess > version) {
                System.out.println("Загаданное число больше");
                attempts -= 1;
            } else {
                System.out.println("Загаданное число меньше");
                attempts -= 1;
            }

            if (attempts == 0) {
                System.out.println("Вы проиграли...Повторить игру еще раз? 1 – да / 0 – нет");
                version = sc.nextInt();
                if (version == 0) {
                    break;
                } else if (version == 1) {
                    guess = rand.nextInt(9);
                    attempts = 3;
                } else {
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                }
            }
        }
        while (true);
    }
}
/*
    char a = answer.charAt(0), b = answer.charAt(1), c = answer.charAt(2), d = answer.charAt(3),
            e = answer.charAt(4), f = answer.charAt(5), g = answer.charAt(6), h = answer.charAt(7),
            k = answer.charAt(8);
    char a1 = guess.charAt(0), b1 = guess.charAt(1), c1 = guess.charAt(2), d1 = guess.charAt(3),
            e1 = guess.charAt(4), f1 = guess.charAt(5), g1 = guess.charAt(6), h1 = guess.charAt(7),
            k1 = guess.charAt(8);
 */