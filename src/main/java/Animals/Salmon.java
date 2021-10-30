package Animals;

import Food.Food;

public class Salmon implements Swim {
    @Override
    public void swim() {
        System.out.println("Я лосось и я умею быстро плавать");
    }
}
