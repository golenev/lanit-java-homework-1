package Animals;

import Food.Food;

public class Duck extends Herbivore implements Swim, Voice {


    @Override
    public String voice() {
        return "Ya uto4ka - krya-krya";
    }

    @Override
    public void swim() {
        System.out.println("Я утка, и я хорошо плаваю");
    }
}
