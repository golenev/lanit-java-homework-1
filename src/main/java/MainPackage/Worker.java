package MainPackage;

import Animals.Animals;
import Animals.Rabbit;
import Animals.Voice;
import Animals.Wolf;
import Animals.Rabbit;
import Food.*;

public class Worker {

    public void feed(Animals animals, Food food) {
        System.out.println(animals.eat(food));
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}
