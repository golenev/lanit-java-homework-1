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
    private static String meow;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
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

    public static String getMeow() {
        return meow;
    }

    public static void setMeow(String meow) {
        Kotik.meow = meow;
    }

    public Kotik(String name, int satiety, boolean hunger) {
        this.name = name;
        this.satiety = satiety;
        this.hunger = hunger;
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
        Kotik kotik = new Kotik("Boris", 40, true);
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