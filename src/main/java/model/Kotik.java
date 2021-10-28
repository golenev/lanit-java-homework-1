package model;

import java.util.Random;

public class Kotik {
    private static int objectCount = 1;
    private String name;
    private int satiety;
    private boolean hunger;
    private static int food = 100;
    private static int appetite = 20;
    private int eating = food - appetite;
    public int increaseFood = 50;
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

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public static int getAppetite() {
        return appetite;
    }

    public static void setAppetite(int appetite) {
        Kotik.appetite = appetite;
    }



    public Kotik(String name, int satiety, boolean hunger, String meow) {
        this.name = name;
        this.satiety = satiety;
        this.hunger = hunger;
        this.meow = meow;
    }
    public static int counterObj() {
        return objectCount++;
    }

    public boolean isHunger() {
        if (satiety <= 50) {
            System.out.println("Еда кончилась");
        }
        return true;
    }
    public boolean run() {
        System.out.println("побегал");
        return true;
    }

    public static boolean equals(Kotik kotik, Kotik kotik1) {
        System.out.println("Сравниванием мяукание котов");
        System.out.println(kotik.meow == kotik1.meow);

        return true;
        }
    ;

    ;
    public boolean sleep() {
        System.out.println("поспал");
        return true;
    }
    ;
    public boolean eat() {
        System.out.println("Поел, еды осталось " + (food -= appetite));
        return true;
    }
    ;
    public boolean play() {

        System.out.println("поиграл");
        return true;
    }
    ;
    public void liveAnotherDay() {
        Random random = new Random();
        Kotik kotik = new Kotik("Boris", 40, true, "Meeeeeeeeeooow");
        for (int i = 0; i < 24; i++) {
            int num = random.nextInt(5);
            switch (num) {
                case 0:
                    kotik.run();
                    break;
                case 1:
                    kotik.play();
                    break;
                case 2:
                    kotik.eat();

                    if (food <= 0) {
                        food += increaseFood;
                        System.out.println("Еда кончилась, положили добавку");

                    }

                    break;

                case 3:
                    kotik.sleep();
                    break;
            }
        }
    }
}