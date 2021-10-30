package model;

import java.util.Random;

public class Kotik {
    private static int objectCount = 1;
    private String name;
    private static boolean hungryKot;
    private static int food = 3;
    private static int appetite = 20;
    private static int foodAddition = 30;
    String meow;


    public static int getObjectCount() {
        return objectCount;
    }

    public static void setObjectCount(int objectCount) {
        Kotik.objectCount = objectCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static int getAppetite() {
        return appetite;
    }

    public static void setAppetite(int appetite) {
        Kotik.appetite = appetite;
    }


    public Kotik(String name, int food, String meow) {
        this.name = name;
        this.food = food;
        this.meow = meow;
    }

    public static int counterObj() {
        return objectCount++;
    }

    private boolean isHungryKot() {

        if (food <= 0) {
            System.out.println("Кот голоден! Корми его! Он больше не будет ничего делать");
            hungryKot = true;
            eat();
        } else {
            System.out.print("Кот не голоден. ");
            hungryKot = false;
        }
        return hungryKot;
    }

    public void sleep() {
        food--;
        System.out.println("Кот уснул, " + " еды осталось " + food);
    }

    public void play() {
        food--;
        System.out.println("Кот поиграл, " + "еды осталось " + food);
    }

    public void chaseMouse() {
        food--;
        System.out.println("Кот поймал мышь, " + "еды осталось " + food);
    }

    public void say() {
        food--;
        System.out.println("Мяу, " + "еды осталось " + food);
    }

    public void eat() {
        food = food + foodAddition;
        System.out.println("Раб покормил кота, теперь еды стало " + food);
    }

    public static boolean equals(Kotik kotik, Kotik kotik1) {
        System.out.println("Сравниванием мяукание котов");
        if (kotik.meow.equals(kotik1.meow)) {
            System.out.println("мяукают одинакового");
        } else {
            System.out.println("Они мяукают по-разному");
        }
        return true;
    }

    public void liveAnotherDay() {
        Random random = new Random();
        Kotik kotik = new Kotik("Boris", 15, "Meeeeeeeeeooow");
        for (int i = 0; i < 26; i++) {
            int num = random.nextInt(4);
            switch (num) {
                case 0:
                    if (isHungryKot()) ;
                    else
                        play();
                    break;
                case 1:
                    if (isHungryKot()) ;
                    else
                        say();
                    break;
                case 2:
                    if (isHungryKot()) ;
                    else
                        sleep();
                    break;
                case 3:
                    if (isHungryKot()) ;
                    else
                        chaseMouse();
                    break;
                case 4:
                    if (isHungryKot()) ;
                    else
                        eat();
                    break;
            }
        }
    }
}