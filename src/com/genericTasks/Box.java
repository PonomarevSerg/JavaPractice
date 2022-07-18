package com.genericTasks;

import java.util.List;

public class Box <T extends Fruit> {
    private List<T> boxList;                    //Создать ArrayList
    private float boxWeight;

    public Box(List<T> boxList) {                 //добавить в параметр кол-во фруктов (ArrayList)
        this.boxList = boxList;
    }

    public void addFruit (T fruit) {
        this.boxList.add(fruit);
    }

    public float getWeight () {                //Метод высчитывает вес коробки.
        float sumWeight = 0f;
        for (T fruit : this.boxList) {
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
    }

    public boolean compare (Box box) {
        return this.getWeight() == box.getWeight();
    }

    public List<T> getBoxList() {
        return boxList;
    }

    public void setBoxList(List<T> boxList) {
        this.boxList = boxList;
    }
}
