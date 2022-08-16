package com.inputOutputTasks;

import com.inputOutputTasks.model.User;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        File file = new File("test3.csv");

        UserRepository userRepository = new UserRepository(file);
        UserService userService = new UserService(userRepository);

        userService.findAll().forEach(System.out::println);

        System.out.println("=============================");

        User byId = userService.findById(3);
        System.out.println(byId);

        User user10 = new User(10, "Oleg", 35);
        userService.save(user10);

        System.out.println("=============================");

        userService.findAll().forEach(System.out::println);

        System.out.println("=============================");
        System.out.println(userService.existsById(3));

        System.out.println("=============================");
        //userService.delete(user10);
        System.out.println("=============================");

        userService.findAll().forEach(System.out::println);

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
//            bw.newLine();
//            bw.append("1;Sergey;26");
//            bw.newLine();
//            bw.append("2;Vlad;22");
//            bw.newLine();
//            bw.append("3;Pavel;30");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}