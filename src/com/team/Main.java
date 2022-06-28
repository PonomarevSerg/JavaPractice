package com.team;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[2];
        Wall wall = new Wall(0.1);
        Pool pool = new Pool(10);
        obstacles[0] = wall;
        obstacles[1] = pool;

        Course course = new Course(obstacles);

        Animal[] animals = new Animal[2];
        Animal cat = new Cat();
        Animal dolphin = new Dolphin();

        animals[0] = cat;
        animals[1] = dolphin;

        Team team = new Team(animals, "Zenith");



    }
}
