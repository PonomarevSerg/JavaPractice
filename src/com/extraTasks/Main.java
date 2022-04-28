package com.extraTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // shiftArr();
        guess();
        // randomTask();
        // guess2();
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
        int random = rand.nextInt(words.length - 1);
        String guessWord = words[random];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите слово:");
            String userWord = scanner.nextLine();
            if (guessWord.equals(userWord)) {
                System.out.println("Word: " + guessWord);
                break;
            }

            for (int i = 0; i < userWord.length() || i < guessWord.length(); i++) {
                if (guessWord.charAt(i) == userWord.charAt(i)) {
                    System.out.print(guessWord.charAt(i));
                } else {
                    System.out.print("#");
                }
            }

            for (int j = 15 - guessWord.length(); j > 0; j--) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
        while (true);
    }

    public static void guess2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int random = rand.nextInt(words.length - 1);
        String guessWord = words[random];
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();

        char[] result = new char[15];
        Arrays.fill(result, '#');

        for (int i = 0; i < guessWord.length() || i < userWord.length(); i++) {
            if (guessWord.charAt(i) == userWord.charAt(i)) {
                result[i] = guessWord.charAt(i);
            }
        }
        System.out.print(result);
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