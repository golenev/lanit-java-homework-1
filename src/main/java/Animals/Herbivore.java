package Animals;

import Food.*;

public class Herbivore extends Animals {


    @Override
    public boolean eat(Food food) {
        if (food instanceof Grass) {
            System.out.print("Спасибо, поем ");
            return true;
        } else {
            System.out.print("Я травоядный, я не ем такую мясо ");
            return false;
        }
    }
}
