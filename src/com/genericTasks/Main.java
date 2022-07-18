package com.genericTasks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Box<Orange> orangeBox = new Box<Orange>(); - добавить в параметр кол-во фруктов
        //Box<Apple> appleBox = new Box<Apple>(); - добавить в параметр кол-во фруктов

        String[] strings = {"Sergey", "Igor"};

        swapElements(strings, 0, 1);

        for (Object showObjects : strings) {
            System.out.println(showObjects);
        }

        List<Orange> orangeBoxList = new ArrayList<Orange>();
        List<Apple> appleBoxList = new ArrayList<Apple>();

        Box<Orange> orangeBox = new Box<Orange>(orangeBoxList);
        Box<Apple> appleBox = new Box<Apple>(appleBoxList);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);

        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);
        appleBox.addFruit(apple4);

//        Orange orangeFromBoxList1 = orangeBoxList.get(0);
//        Orange orangeFromBoxList2 = orangeBoxList.get(1);
//
//        Apple appleFromBoxList1 = appleBoxList.get(0);
//        Apple appleFromBoxList2 = appleBoxList.get(1);
//        Apple appleFromBoxList3 = appleBoxList.get(2);
//        Apple appleFromBoxList4 = appleBoxList.get(3);

//        System.out.println(appleBox.getBoxList().get(0));
//        System.out.println(appleBox.getBoxList().get(1));

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
    }

    public static void swapElements(Object[] objects, int n1, int n2) {
        Object object1 = objects[n1];
        objects[n1] = objects[n2];
        objects[n2] = (object1);
    }


}
