package Animals;

import Food.*;

public class Wolf extends Predator implements Voice, Run {


    @Override
    public String voice() {
        return " Я сервыый волк, щас спою - Whohohohohohhooooooo";
    }

    @Override
    public String run() {
        return "быстро бегаю за зайцами";
    }

    public boolean eat(Food meat) {
        return super.eat(meat);
    }
}
