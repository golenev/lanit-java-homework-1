package MainPackage;

import Food.*;
import Animals.*;
import Food.Food;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Worker worker = new Worker();
        Duck duck = new Duck();
        Salmon salmon = new Salmon();
        Wolf wolf = new Wolf();
        Fish fish = new Fish();
        Grass grass = new Grass();
        Meat meat = new Meat();
        worker.feed(wolf, meat);
        worker.feed(wolf, grass);
        worker.feed(rabbit, grass);
        worker.feed(rabbit, meat);

        System.out.println(); // для пустой строки;
        worker.getVoice(wolf);
        worker.getVoice(duck);
        worker.getVoice(rabbit);

        System.out.println(); //для пустой строки
        List<Swim> pond = new ArrayList<>();
        pond.add(duck);
        pond.add(salmon);
        pond.forEach(Swim::swim);
    }
}
