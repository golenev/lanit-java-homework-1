package Animals;

import Food.*;

public class Predator extends Animals {


    @Override
    public boolean eat(Food food) {
        if (food instanceof Meat) {
            System.out.print("Спасибо, поем ");
            return true;
        } else {
            System.out.print("Я хищник, и не ем такую еду  ");
            return false;
        }
    }
}

