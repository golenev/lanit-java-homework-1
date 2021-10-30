package Animals;

import Food.Food;

public class Fish extends Animals implements Swim {


    @Override
    public void swim() {
        System.out.println("Я тоже умею плавать");
    }


    @Override
    public boolean eat(Food food) {
        return false;
    }
}
