package Animals;
import Food.*;

public class Rabbit extends Herbivore implements Voice, Run {




    @Override
    public String run() {
        return "Умею быстро бегать";
    }
    @Override
    public String voice() {
        return "Я кролик, и я не особо издаю звуки";
    }
    public boolean eat(Food grass) {
                return super.eat(grass);
    }
}


